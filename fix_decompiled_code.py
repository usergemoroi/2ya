#!/usr/bin/env python3
"""
Скрипт для автоматического исправления артефактов декомпиляции в Java файлах
"""

import os
import re
import sys
from pathlib import Path

def fix_java_file(file_path):
    """Исправляет артефакты декомпиляции в Java файле"""
    try:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        
        original_content = content
        changes = []
        
        # Удаляем строки с ** GOTO
        if '** GOTO' in content:
            content = re.sub(r'^\s*\*\* GOTO .*$', '', content, flags=re.MULTILINE)
            changes.append('Removed ** GOTO statements')
        
        # Удаляем строки с ** continue
        if '** continue' in content:
            content = re.sub(r'^\s*\*\* continue;.*$', '', content, flags=re.MULTILINE)
            changes.append('Removed ** continue statements')
        
        # Удаляем строки с ** break
        if '** break' in content:
            content = re.sub(r'^\s*\*\* break;.*$', '', content, flags=re.MULTILINE)
            changes.append('Removed ** break statements')
        
        # Удаляем метки вида lbl-XXX: (но оставляем их внутри комментариев)
        if 'lbl-' in content:
            content = re.sub(r'^\s*lbl-\d+:\s*$', '', content, flags=re.MULTILINE)
            # Также удаляем inline метки
            content = re.sub(r'\s+lbl-\d+:\s*', ' ', content)
            changes.append('Removed lbl- labels')
        
        # Удаляем комментарии о sources после меток
        content = re.sub(r'^\s*// \d+ sources?\s*$', '', content, flags=re.MULTILINE)
        
        # Исправляем пустые строки (больше 2 подряд)
        content = re.sub(r'\n\n\n+', '\n\n', content)
        
        # Исправляем catch без try (удаляем такие блоки)
        # Это сложнее, поэтому пока просто закомментируем
        if "catch (" in content:
            lines = content.split('\n')
            new_lines = []
            in_bad_catch = False
            brace_count = 0
            
            for i, line in enumerate(lines):
                # Ищем catch без try
                if 'catch (' in line:
                    # Проверяем, есть ли try выше (последние 20 строк)
                    has_try = any('try {' in new_lines[j] for j in range(max(0, len(new_lines)-20), len(new_lines)))
                    if not has_try:
                        in_bad_catch = True
                        brace_count = 0
                        new_lines.append('        // Removed invalid catch block')
                        continue
                
                if in_bad_catch:
                    if '{' in line:
                        brace_count += line.count('{')
                    if '}' in line:
                        brace_count -= line.count('}')
                    
                    if brace_count <= 0:
                        in_bad_catch = False
                    continue
                
                new_lines.append(line)
            
            content = '\n'.join(new_lines)
            changes.append('Removed invalid catch blocks')
        
        # Если были изменения, сохраняем файл
        if content != original_content:
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(content)
            return True, changes
        
        return False, []
        
    except Exception as e:
        print(f"Error processing {file_path}: {e}", file=sys.stderr)
        return False, []

def fix_directory(directory):
    """Обрабатывает все Java файлы в директории"""
    fixed_count = 0
    total_count = 0
    
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith('.java'):
                total_count += 1
                file_path = os.path.join(root, file)
                was_fixed, changes = fix_java_file(file_path)
                if was_fixed:
                    fixed_count += 1
                    print(f"Fixed: {file_path}")
                    for change in changes:
                        print(f"  - {change}")
    
    return fixed_count, total_count

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("Usage: fix_decompiled_code.py <directory>")
        sys.exit(1)
    
    directory = sys.argv[1]
    if not os.path.isdir(directory):
        print(f"Error: {directory} is not a directory")
        sys.exit(1)
    
    print(f"Fixing Java files in {directory}...")
    fixed, total = fix_directory(directory)
    print(f"\nDone! Fixed {fixed} out of {total} files")

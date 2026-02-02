cmake_minimum_required(VERSION 3.10)
project(SignatureKiller)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Find required packages
find_library(LOG_LIB log)
find_library(ANDROID_LIB android)
find_library(DL_LIB dl)
find_library(SSL_LIB ssl)
find_library(CRYPTO_LIB crypto)

# Source files
set(SOURCES
    src/signature_killer.cpp
    src/advanced_bypass.cpp
)

# Header files
set(HEADERS
    include/signature_killer.h
    include/advanced_bypass.h
    include/xhook.h
)

# Create shared library
add_library(SignatureKiller SHARED ${SOURCES})

# Include directories
target_include_directories(SignatureKiller PRIVATE
    ${CMAKE_CURRENT_SOURCE_DIR}/include
)

# Link libraries
target_link_libraries(SignatureKiller
    ${LOG_LIB}
    ${ANDROID_LIB}
    ${DL_LIB}
    ${SSL_LIB}
    ${CRYPTO_LIB}
)

# Compiler flags
target_compile_options(SignatureKiller PRIVATE
    -Wall
    -Wextra
    -O2
    -fvisibility=hidden
)

# Strip symbols in release builds
if(CMAKE_BUILD_TYPE STREQUAL "Release")
    target_link_options(SignatureKiller PRIVATE
        -s
        -Wl,--exclude-libs,ALL
    )
endif()

# Output name
set_target_properties(SignatureKiller PROPERTIES
    OUTPUT_NAME "SignatureKiller"
    LIBRARY_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/lib/${ANDROID_ABI}"
)

# Install targets
install(TARGETS SignatureKiller
    LIBRARY DESTINATION lib/${ANDROID_ABI}
)

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 *  kotlin.comparisons.a
 */
package io.intercom.android.sdk.homescreen;

import io.intercom.android.sdk.models.Conversation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0000\u001a \u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0000\u001a\u001a\u0010\r\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"MAX_CONVERSATIONS_TO_DISPLAY", "", "THREE_DAYS_MILLISECONDS", "", "filterRecentConversations", "", "Lio/intercom/android/sdk/models/Conversation;", "currentTime", "preventMultipleInbound", "", "hasOlderUnreadConversations", "unReadConversationIds", "", "hasRecentInboundConversation", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
@SourceDebugExtension(value={"SMAP\nConversationListExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationListExtensions.kt\nio/intercom/android/sdk/homescreen/ConversationListExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1054#2:31\n3190#2,10:32\n766#2:42\n857#2,2:43\n766#2:45\n857#2,2:46\n1549#2:48\n1620#2,3:49\n1747#2,3:52\n*S KotlinDebug\n*F\n+ 1 ConversationListExtensions.kt\nio/intercom/android/sdk/homescreen/ConversationListExtensionsKt\n*L\n12#1:31\n13#1:32,10\n14#1:42\n14#1:43,2\n16#1:45\n16#1:46,2\n25#1:48\n25#1:49,3\n29#1:52,3\n*E\n"})
public final class ConversationListExtensionsKt {
    private static final int MAX_CONVERSATIONS_TO_DISPLAY = 3;
    private static final long THREE_DAYS_MILLISECONDS = 259200000L;

    @NotNull
    public static final List<Conversation> filterRecentConversations(@NotNull List<? extends Conversation> collection, long l10, boolean bl2) {
        y.j(collection, "<this>");
        long l11 = l10 - 259200000L;
        if (bl2) {
            Object object;
            Object object2 = kotlin.collections.t.V0((Iterable)collection, new Comparator(){

                public final int compare(T t13, T t14) {
                    return a.d((Comparable)Long.valueOf(((Conversation)t14).getLastPart().getCreatedAt()), (Comparable)Long.valueOf(((Conversation)t13).getLastPart().getCreatedAt()));
                }
            });
            collection = new ArrayList<Conversation>();
            ArrayList<Object> arrayList = new ArrayList();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                if (((Conversation)object).isRecentInboundConversation(l10)) {
                    ((ArrayList)collection).add(object);
                    continue;
                }
                arrayList.add(object);
            }
            arrayList = new t((List<? extends Conversation>)collection, arrayList);
            collection = (List)((t)((Object)arrayList)).a();
            arrayList = (List)((t)((Object)arrayList)).b();
            collection = collection;
            object2 = arrayList;
            arrayList = new ArrayList<Object>();
            object = object2.iterator();
            while (object.hasNext()) {
                object2 = object.next();
                if (!((Conversation)object2).createdSince(l11)) continue;
                arrayList.add(object2);
            }
            collection = kotlin.collections.t.M0((Collection)collection, arrayList);
        } else {
            Object object = collection;
            collection = new ArrayList<Conversation>();
            object = object.iterator();
            while (object.hasNext()) {
                Object e11 = object.next();
                if (!((Conversation)e11).createdSince(l11)) continue;
                collection.add(e11);
            }
        }
        return kotlin.collections.t.X0((Iterable)collection, (int)3);
    }

    public static final boolean hasOlderUnreadConversations(@NotNull List<? extends Conversation> list, @NotNull List<String> iterable) {
        y.j(list, "<this>");
        y.j(iterable, "unReadConversationIds");
        iterable = kotlin.collections.t.j1((Iterable)iterable);
        Object object = list;
        list = new ArrayList<Conversation>(kotlin.collections.t.x((Iterable)object, (int)10));
        object = object.iterator();
        while (object.hasNext()) {
            list.add((Conversation)((Object)((Conversation)object.next()).getId()));
        }
        return ((Collection)kotlin.collections.t.W0(iterable, list)).isEmpty() ^ true;
    }

    public static final boolean hasRecentInboundConversation(@NotNull List<? extends Conversation> object, long l10) {
        boolean bl2;
        block3: {
            y.j(object, "<this>");
            object = (Iterable)object;
            bl2 = object instanceof Collection;
            boolean bl3 = false;
            if (bl2 && ((Collection)object).isEmpty()) {
                bl2 = bl3;
            } else {
                object = object.iterator();
                do {
                    bl2 = bl3;
                    if (!object.hasNext()) break block3;
                } while (!((Conversation)object.next()).isRecentInboundConversation(l10));
                bl2 = true;
            }
        }
        return bl2;
    }
}


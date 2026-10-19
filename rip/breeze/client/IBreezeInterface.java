package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;

interface IBreezeInterface {
   boolean containsEntry(long var1, String var3);

   Object resolve(String var1, AtomicInteger var2, long var3, Util112 var5);
}

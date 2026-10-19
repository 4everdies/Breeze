package rip.breeze.client;

import java.util.Map.Entry;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

final class Util94<K, V> implements Entry<K, V> {
   Util94<K, V> clientUtil5_a;
   Util94<K, V> clientUtil5_b;
   Util94<K, V> clientUtil5_c;
   Util94<K, V> clientUtil5_d;
   Util94<K, V> clientUtil5_e;
   final K key = (K)null;
   V value;
   int fieldInt_h;

   Util94() {
      this.clientUtil5_d = this.clientUtil5_e = this;
   }

   Util94(Util94 var1, Object var2, long var3, Util94 var5, Util94 var6) {
      var3 = /*CIPHER_KEY_i*/ 0L ^ var3;
      super();
      this.clientUtil5_a = var1;
      this.key = (K)var2;
      this.fieldInt_h = 1;
      ConfigMap.values();
      this.clientUtil5_d = var5;
      this.clientUtil5_e = var6;
      var6.clientUtil5_d = this;
      var5.clientUtil5_e = this;
      if (LicenseState.checkCondition()) {
         ConfigMap.initialize(new LicenseState[2]);
      }
   }

   @Override
   public K getKey() {
      return this.key;
   }

   @Override
   public V getValue() {
      return this.value;
   }

   @Override
   public V setValue(V var1) {
      Object var2 = this.value;
      this.value = (V)var1;
      return (V)var2;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 58070678191299L;
      if (!(var1 instanceof Entry)) {
         return false;
      }

      Entry var4 = (Entry)var1;
      return (this.key == null ? var4.getKey() == null : this.key.equals(var4.getKey()))
         && (this.value == null ? var4.getValue() == null : this.value.equals(var4.getValue()));
   }

   @Override
   public int hashCode() {
      long var1 = 27290150300529L;
      return (this.key == null ? 0 : this.key.hashCode()) ^ (this.value == null ? 0 : this.value.hashCode());
   }

   @Override
   public String toString() {
      return this.key + "=" + this.value;
   }

   public Util94 getClientUtil5(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util94./*CIPHER_KEY_i*/ 0L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: aload 0
      // 07: astore 3
      // 08: invokestatic rip/breeze/client/ConfigMap.values ()[Lrip/breeze/LicenseState;
      // 0b: aload 3
      // 0c: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 0f: astore 4
      // 11: astore 5
      // 13: aload 4
      // 15: ifnull 26
      // 18: aload 4
      // 1a: astore 3
      // 1b: aload 3
      // 1c: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 1f: astore 4
      // 21: aload 5
      // 23: ifnonnull 13
      // 26: aload 3
      // 27: lload 1
      // 28: lconst_0
      // 29: lcmp
      // 2a: iflt 1f
      // 2d: areturn
   }

   public Util94 getClientUtil5_2(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util94./*CIPHER_KEY_i*/ 0L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: invokestatic rip/breeze/client/ConfigMap.values ()[Lrip/breeze/LicenseState;
      // 09: aload 0
      // 0a: astore 3
      // 0b: aload 3
      // 0c: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 0f: astore 4
      // 11: astore 5
      // 13: aload 4
      // 15: ifnull 26
      // 18: aload 4
      // 1a: astore 3
      // 1b: aload 3
      // 1c: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 1f: astore 4
      // 21: aload 5
      // 23: ifnonnull 13
      // 26: aload 3
      // 27: lload 1
      // 28: lconst_0
      // 29: lcmp
      // 2a: iflt 1f
      // 2d: areturn
   }
}

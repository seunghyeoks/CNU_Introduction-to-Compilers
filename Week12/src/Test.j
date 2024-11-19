.class public Test
.super java/lang/Object
; strandard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method


.method public static main([Ljava/lang/String;)V
.limit stack 32
.limit locals 32
bipush 10
istore_0
bipush 5
istore_1
bipush 0
istore_2
iload_0
iload_1
iadd
iload_1
iadd
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
return
.end method


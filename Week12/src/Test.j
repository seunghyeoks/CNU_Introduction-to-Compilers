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
istore_3
iload_0
bipush 2
idiv
istore_0
iload_1
iload_0
imul
istore_0
iload_3
iload_1
isub
istore_2
iload_0
iload_1
iadd
istore_3
iload_0
iload_1
irem
istore_1
iload_0
iload_1
iadd
iload_1
iadd
istore_2
bipush 12
bipush 21
imul
bipush 3
idiv
bipush 5
irem
bipush 1
isub
bipush 4
iadd
istore_1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_0
invokevirtual java/io/PrintStream.println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_1
invokevirtual java/io/PrintStream.println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_3
invokevirtual java/io/PrintStream.println(I)V
return
.end method

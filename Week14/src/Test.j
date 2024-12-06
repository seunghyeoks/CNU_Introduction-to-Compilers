.class public Test
.super java/lang/Object
; strandard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public static add(II)I
.limit stack 32
.limit locals 32
iload_0
iload_1
iadd
ireturn
.end method

.method public static div(I)I
.limit stack 32
.limit locals 32
iload_0
ireturn
.end method

.method public static mal(I)V
.limit stack 32
.limit locals 32
return
.end method

.method public static azeros()I
.limit stack 32
.limit locals 32
bipush 4
ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 32
.limit locals 32
bipush 1
istore_0
bipush 2
istore_1
bipush 0
istore_2
iload_0
iload_1
invokestatic Test/add(II)I
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
iload_0
invokestatic Test/div(I)I
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
invokestatic Test/azeros()I
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
return
.end method


.class public Fibonacci
.super java/lang/Object
; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static fib(I)I
.limit stack 32
.limit locals 32
iload_0
ifgt NotZero
iconst_0
ireturn
NotZero:
iload_0
iconst_1
if_icmpne NotOne
iconst_1
ireturn
NotOne:
iconst_0
istore_1
iconst_1
istore_2
iconst_2
istore_3
While:
iload_3
iload_0
if_icmpgt CountReached
iload_1
iload_2
iadd
istore 4
iload_2
istore_1
iload 4
istore_2
iinc 3 1
goto While
CountReached:
iload_2
ireturn 
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 32
.limit locals 32
ldc 10
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokestatic Fibonacci/fib(I)I 
invokevirtual java/io/PrintStream/println(I)V
return
.end method
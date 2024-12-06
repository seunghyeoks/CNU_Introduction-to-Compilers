.class public Test
.super java/lang/Object
; strandard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public static forl()I
.limit stack 32
.limit locals 32
bipush 0
istore_0
bipush 1
istore_1
LABEL_Loop_0:
iload_1
bipush 10
if_icmpge LABEL_Break_1
iload_0
iload_1
iadd
istore_0
iload_1
bipush 1
iadd
istore_1
goto LABEL_Loop_0
LABEL_Break_1:
iload_0
ireturn
.end method

.method public static ll()I
.limit stack 32
.limit locals 32
bipush 0
istore_0
LABEL_Loop_0:
iload_0
bipush 10
if_icmple LABEL_Else_3
LABEL_True_2:
goto LABEL_Break_1
goto LABEL_End_4
LABEL_Else_3:
LABEL_End_4:
iload_0
bipush 1
iadd
istore_0
goto LABEL_Loop_0
LABEL_Break_1:
iload_0
ireturn
.end method

.method public static add(II)I
.limit stack 32
.limit locals 32
iload_0
iload_1
iadd
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
bipush 1
if_icmple LABEL_Else_1
iload_1
bipush 1
if_icmple LABEL_Else_1

LABEL_True_0:
invokestatic Test/forl()I
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
goto LABEL_End_2
LABEL_Else_1:
invokestatic Test/ll()I
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
LABEL_End_2:
return
.end method


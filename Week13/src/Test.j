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
bipush 20
istore_2
bipush 0
istore_3
iload_0
bipush 10
if_icmpne LABEL_1
iload_1
bipush 5
if_icmpne LABEL_1
LABEL_0:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_0
invokevirtual java/io/PrintStream.println(I)V
goto LABEL_2
LABEL_1:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_1
invokevirtual java/io/PrintStream.println(I)V
LABEL_2:
iload_2
bipush 20
if_icmpeq LABEL_7
goto LABEL_4
LABEL_7:
iload_3
bipush 0
if_icmpne LABEL_5
LABEL_4:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
goto LABEL_6
LABEL_5:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_3
invokevirtual java/io/PrintStream.println(I)V
LABEL_6:
iload_0
iload_1
if_icmpge LABEL_9
LABEL_8:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
goto LABEL_10
LABEL_9:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_0
invokevirtual java/io/PrintStream.println(I)V
LABEL_10:
iload_0
iload_1
if_icmplt LABEL_13
LABEL_12:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_0
invokevirtual java/io/PrintStream.println(I)V
goto LABEL_14
LABEL_13:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_1
invokevirtual java/io/PrintStream.println(I)V
LABEL_14:
iload_2
iload_0
if_icmple LABEL_17
LABEL_16:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream.println(I)V
goto LABEL_18
LABEL_17:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_3
invokevirtual java/io/PrintStream.println(I)V
LABEL_18:
iload_0
iload_1
if_icmpne LABEL_23
goto LABEL_20
LABEL_23:
iload_0
bipush 10
if_icmpeq LABEL_21
LABEL_20:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_1
invokevirtual java/io/PrintStream.println(I)V
goto LABEL_22
LABEL_21:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_0
invokevirtual java/io/PrintStream.println(I)V
LABEL_22:
return
.end method


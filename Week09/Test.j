.class public Test
.super java/lang/Object
; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static cal(II)I
.limit stack 32
.limit locals 32
iload_0        
iload_1        
imul           
iconst_2
isub          
iconst_3
idiv          
ireturn      
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 32
.limit locals 32
ldc 13       
istore_2
getstatic java/lang/System/out Ljava/io/PrintStream;
iconst_2    
iload_2
invokestatic Test/cal(II)I 
invokevirtual java/io/PrintStream/println(I)V
return
.end method
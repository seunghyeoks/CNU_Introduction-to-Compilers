grammar tinyR4;

program	    : decl+	;

decl		: 	fun_decl ;

fun_decl	: FUNC id '(' params ')' ret_type_spec compound_stmt    ;

params		:
		| param (',' param)*
		;

param		:  id ':' type_spec 		;

type_spec	:  U32				    ; 

ret_type_spec	:
		| RARROW type_spec
		;

compound_stmt: '{' local_decl* stmt* '}'	;

local_decl	: dec_spec id  (':' type_spec)? '=' val ';' ;

dec_spec	: LET (MUT)?            ; 

val 		: literal
                | id
                ;

stmt		: expr_stmt
		| compound_stmt
		| if_stmt
		| for_stmt
		| return_stmt
		| break_stmt
		| loop_stmt
		;

expr_stmt	: expr 		';'		;

expr	:   additive_expr
	| relative_expr
	| id '=' expr
	;

additive_expr: left=additive_expr op=('+'|'-') right=multiplicative_expr
        | multiplicative_expr
        ;

multiplicative_expr:  left=multiplicative_expr op=('*'|'/'|'%') right=unary_expr
        |unary_expr
        ;

unary_expr: op=('-'|'+'|'--'|'++'|'!') expr
        | factor
        ;

factor : (literal|id)
         	| '(' expr ')'
         	| id '!'? '(' args ')'
         ;

relative_expr: left=relative_expr op=(AND|OR) right=comparative_expr
         	 | comparative_expr
         	 ;

comparative_expr : left=comparative_expr op=(EQ|NE|LE|'<'|GE|'>') right=additive_expr
            | additive_expr
            ;

if_stmt		:  IF  relative_expr  compound_stmt (ELSE compound_stmt)? 		;

for_stmt    :  FOR id 'in' range compound_stmt       ;

loop_stmt   :  LOOP compound_stmt;

range       :  literal '..' ('=')? literal  ;

return_stmt	: RETURN (expr)? ';'            ;

break_stmt  : BREAK ';';

args	:
       | expr (',' expr)*                   ;

literal : LITERAL;

id      : ID;

FUNC: 'fn';
U32: 'u32';

LOOP: 'loop';
FOR: 'for';
IF: 'if';
ELSE: 'else';
RETURN: 'return';
LET: 'let';
MUT: 'mut';
BREAK: 'break';

OR: '||';
AND: '&&';
LE: '<=';
GE: '>=';
EQ: '==';
NE: '!=';
RARROW: '->';

ID  : [a-zA-Z_] [_a-zA-Z0-9]*;

LITERAL:  LIT_INT | LIT_STR;

LIT_INT: DecimalConstant     |   OctalConstant     |   HexadecimalConstant
        | NilConstant | WildCardConstant   ;

LIT_STR : '"' .*? '"' ;

DecimalConstant
    :   '0'
	|   [1-9] [0-9]*
    ;

OctalConstant
    :   '0'[0-7]*
    ;

HexadecimalConstant
    :   '0' [xX] [0-9a-fA-F] +
    ;

NilConstant
	: 'NIL'
	| 'nil'
	;

WildCardConstant
	: '_'
	;

WS  :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
	-> channel(HIDDEN)
    ;
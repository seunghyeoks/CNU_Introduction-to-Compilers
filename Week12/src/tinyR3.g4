grammar tinyR3;

program	    : decl+	;

decl		: main_decl
            ;

main_decl   : FUNC 'main' '()' compound_stmt
            ;

type_spec	:  U32				    ;     // how about including array or string?

compound_stmt: '{' local_decl* stmt* '}'	;

local_decl	: dec_spec id  (':' type_spec)? '=' val ';' ;

dec_spec	: LET (MUT)?            ; 			// how about LET MUT ?

val 		: literal
                | id
                ;

stmt		: expr_stmt
		| compound_stmt
		| return_stmt
		| print_stmt
		;

expr_stmt	: expr 		';'		;

expr	:   additive_expr
	| id '=' expr
	;

additive_expr: left=additive_expr op=('+'|'-') right=multiplicative_expr
        | multiplicative_expr
        ;

multiplicative_expr:  left=multiplicative_expr op=('*'|'/'|'%') right=unary_expr
        |unary_expr
        ;

unary_expr: op=('--'|'++') expr
        | factor
        ;

factor : (literal|id)
         	| '(' expr ')'
         	| id '!'? '(' args ')'
         ;

print_stmt  :  'println!' '(' '"{}"' ',' id ')' ';';

return_stmt	: RETURN (expr)? ';'            ;

args	:
       | expr (',' expr)*                   ;

literal : LITERAL;

id      : ID;

FUNC: 'fn';
U32: 'u32';

RETURN: 'return';
LET: 'let';
MUT: 'mut';

OR: '||';
AND: '&&';
LE: '<=';
GE: '>=';
EQ: '==';
NE: '!=';

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
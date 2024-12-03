grammar tinyRust;

program	    : decl+	;

decl		: main_decl
            | fun_decl
            ;

fun_decl	: FUNC id '(' params ')' ret_type_spec compound_stmt
            ;

main_decl   : FUNC 'main' '()' compound_stmt
            ;

params		:
		| param (',' param)*
		;

param		:  id ':' type_spec 		;

type_spec	:  I32				    ;     // how about including array or string?

ret_type_spec	:
		| RARROW type_spec
		;

compound_stmt: '{' local_decl* stmt* '}'	;

local_decl	: dec_spec id  (':' type_spec)? '=' val ';' ;

dec_spec	: LET (MUT)?            ; 			// how about LET MUT ?

val 		: literal
                | id
                ;

stmt		: expr_stmt
        | assignment_stmt
		| compound_stmt
		| if_stmt
		| for_stmt
		| return_stmt
		| break_stmt
		| loop_stmt
		| print_stmt
		;

expr_stmt	: expr 		';'		;

expr	: relative_expr ;

additive_expr: left=additive_expr op=('+'|'-') right=multiplicative_expr
        | multiplicative_expr
        ;

multiplicative_expr:  left=multiplicative_expr op=('*'|'/'|'%') right=unary_expr
        | unary_expr
        ;

unary_expr: op=('-'|'!') factor
        | factor
        ;

factor : (literal|id)
        | '(' expr ')'
        | id '!'? '(' args ')'
         ;

comparative_expr : left=comparative_expr op=(EQ|NE|LE|'<'|GE|'>') right=additive_expr
            | additive_expr
            ;

relative_expr: left=relative_expr op=(AND|OR) right=comparative_expr
         	 | comparative_expr
         	 ;

assignment_stmt: id '=' expr ';' ;

if_stmt		:  IF  relative_expr  compound_stmt (ELSE compound_stmt)? 		;

for_stmt    :  FOR id 'in' range compound_stmt       ;

loop_stmt   :  LOOP compound_stmt;

print_stmt  :  'println!' '(' '"{}"' ',' id ')' ';';

range       :  literal '..' ('=')? literal  ;

return_stmt	: RETURN (expr)? ';'            ;

break_stmt  : BREAK ';';

args	:
       | expr (',' expr)*                   ;

literal : LITERAL;

id      : ID;

FUNC: 'fn';
I32: 'i32';

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
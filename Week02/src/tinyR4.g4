grammar tinyR4;

program	    : decl+         {System.out.println("202002473 Rule 0");};

decl		: fun_decl      {System.out.println("202002473 Rule 1");};

fun_decl	: FUNC ID '(' params ')' ret_type_spec compound_stmt
                            {System.out.println("202002473 Rule 2");};

params		:                       {System.out.println("202002473 Rule 3-1");}
		    | param (',' param)*    {System.out.println("202002473 Rule 3-2");}
		    ;

param		:  ID ':' type_spec     {System.out.println("202002473 Rule 4");};

type_spec	:  U32              {System.out.println("202002473 Rule 5");};     // how about including array or string?

ret_type_spec
            :                   {System.out.println("202002473 Rule 6-1");}
		    | RARROW type_spec  {System.out.println("202002473 Rule 6-2");}
		    ;

compound_stmt
            : '{' local_decl* stmt* '}'    {System.out.println("202002473 Rule 7");};

local_decl	: dec_spec ID  (':' type_spec)? ('=' val) ';' {System.out.println("202002473 Rule 8");};

dec_spec	: LET (MUT)?    {System.out.println("202002473 Rule 9");}; 			// how about LET MUT ?

val 		: LITERAL       {System.out.println("202002473 Rule 10-1");}
            | ID            {System.out.println("202002473 Rule 10-2");}
            ;

stmt		: expr_stmt         {System.out.println("202002473 Rule 11-1");}
		    | compound_stmt     {System.out.println("202002473 Rule 11-2");}
		    | if_stmt           {System.out.println("202002473 Rule 11-3");}
		    | return_stmt       {System.out.println("202002473 Rule 11-4");}
		    ;

expr_stmt	: expr ';'	        {System.out.println("202002473 Rule 12");}	;

expr	    : additive_expr         {System.out.println("202002473 Rule 13-1");}
	        | relative_expr         {System.out.println("202002473 Rule 13-2");}
	        | ID '=' expr           {System.out.println("202002473 Rule 13-3");}
	        ;

additive_expr
            : left=additive_expr op=('+'|'-') right=multiplicative_expr    {System.out.println("202002473 Rule 14-1");}
            | multiplicative_expr   {System.out.println("202002473 Rule 14-2");}
            ;

multiplicative_expr
            : left=multiplicative_expr op=('*'|'/'|'%') right=unary_expr    {System.out.println("202002473 Rule 15-1");}
            | unary_expr {System.out.println("202002473 Rule 15-2");}
            ;

unary_expr  : op=('-'|'+'|'--'|'++'|'!') expr {System.out.println("202002473 Rule 16-1");}
            | factor    {System.out.println("202002473 Rule 16-2");}
            ;

factor      : (LITERAL|ID)          {System.out.println("202002473 Rule 17-1");}
         	| '(' expr ')'          {System.out.println("202002473 Rule 17-2");}
         	| ID '!'? '(' args ')'  {System.out.println("202002473 Rule 17-3");}
            ;

relative_expr
            : left=relative_expr op=(AND|OR) right=comparative_expr    {System.out.println("202002473 Rule 18-1");}
            | comparative_expr  {System.out.println("202002473 Rule 18-2");}
         	;

comparative_expr
            : left=comparative_expr op=(EQ|NE|LE|'<'|GE|'>') right=additive_expr   {System.out.println("202002473 Rule 19-1");}
            | additive_expr     {System.out.println("202002473 Rule 19-2");}
            ;

if_stmt		:  IF  relative_expr  stmt (ELSE stmt)?     {System.out.println("202002473 Rule 20");};

return_stmt	: RETURN (expr)? ';'    {System.out.println("202002473 Rule 21");};

args	    :                   {System.out.println("202002473 Rule 22-1");}
            | expr (',' expr)*  {System.out.println("202002473 Rule 22-2");}
            ;

FUNC: 'fn';
U32: 'u32';

IF: 'if';
ELSE: 'else';
RETURN: 'return';
LET: 'let';
MUT: 'mut';

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
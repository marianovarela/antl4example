grammar Expression;

parse
 : definicion EOF
 |
 ;

definicion
 : DEF LOWERID parametros DEFEQ expresion
 ;

parametros
 : LOWERID parametros
 | 
 ;
 
expresion
 : expresionExterna
 | expresionExterna SEMICOLON expresion
 ;

expresionExterna
 : expresionIf
 | expresionCase
 | expresionLet
 | expresionLambda
 | expresionInterna
 ;
 
expresionIf
 : IF expresionInterna THEN expresionInterna ramasElse
 ;
 
ramasElse 
 :ELIF expresionInterna THEN expresionInterna ramasElse
 | ELSE expresionInterna
 ;
 
expresionCase
 :CASE expresionInterna ramasCase
 ;
 
ramasCase
 : ramaCase ramasCase
 |
 ;
 
ramaCase
 : PIPE UPPERID parametros ARROW expresionInterna
 ;
 
expresionLet 
 : LET ID parametros DEFEQ expresionInterna IN expresionExterna
 ;
 
expresionLambda
 : LAMBDA parametros ARROW expresionExterna
 ;
 
expresionInterna 
 : expresionAplicacion
 | expresionInterna operadorBinario expresionInterna
 | operadorUnario expresionInterna
 ;
 
operadorBinario
 : AND
 | OR
 | EQ
 | NE
 | GE
 | LE
 | GT
 | LT
 | PLUS
 | MINUS
 | TIMES
 | DIV
 | MOD
 ;
 
operadorUnario
 : NOT 
 | MINUS
 ;

expresionAplicacion 
 : expresionAtomica
 | expresionAplicacion expresionAtomica
 ; 

expresionAtomica 
 : LOWERID
 | UPPERID
 | NUMBER
 | CHAR
 | STRING
 | LPAREN expresion RPAREN 
 ;
  

LOWERID   : [a-z] [_a-zA-Z_0-9]*;
UPPERID   : [A-Z] [_a-zA-Z_0-9]*;
//CHAR:
STRING    : '"' ~["\r\n]* '"'; 
NUMBER    : ( [0-9]* '.' )? [0-9]+;
DEF       : 'def';
ID        : [a-zA-Z_] [a-zA-Z_0-9]*;
IF        : 'if';
THEN      : 'then';
ELIF      : 'elif';
ELSE      : 'else';              
CASE      : 'case';
LET       : 'let';
IN        : 'in';              
DEFEQ     : '=';
SEMICOLON : ';';
LPAREN    : '(';
RPAREN    : ')';              
LAMBDA    : '\\';
PIPE      : '|';
ARROW     : '->';              
AND       : '&&';
OR        : '||';
NOT       : '!';              
EQ        : '==';
NE        : '!=';
GE        : '>=';              
LE        : '<=';              
GT        : '>';
LT        : '<';              
PLUS      : '+';              
MINUS     : '-';
TIMES     : '*';    
DIV       : '/';      
MOD       : '%'; 
NL     : '\r'? '\n' | '\r';
SPACE  : [ \t] -> skip;


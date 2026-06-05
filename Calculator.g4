grammar Calculator;

// Reglas sintácticas
programa
    : instrucciones EOF
    ;

instrucciones
    : instruccion+
    ;

instruccion
    : bucle
    | salida
    ;

bucle
    : WHILE LPAREN condicion RPAREN LBRACE instrucciones RBRACE
    ;

salida
    : PRINTF LPAREN cadena RPAREN SEMI
    ;

condicion
    : CERO
    | UNO
    ;

cadena
    : COMILLA caracteres COMILLA
    ;

caracteres
    : caracter+
    ;

caracter
    : LETRA
    | DIGITO
    | ESPACIO
    | SIMBOLO
    ;

// Tokens
WHILE   : 'while';
PRINTF  : 'printf';

CERO    : '0';
UNO     : '1';

LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
SEMI    : ';';
COMILLA : '"';

LETRA   : [a-zA-Z];
DIGITO  : [0-9];

ESPACIO : ' ';

SIMBOLO : [.,:;!?_];

WS      : [\t\r\n]+ -> skip;
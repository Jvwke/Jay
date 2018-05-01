grammar J;

// keywords
AND         : 'and'     | '&&'  ;
OR          : 'or'      | '||'  ;
BEGIN       : 'begin'           ;
END         : 'end'             ;
PROGRAM     : 'program'         ;
FUNCTION    : 'function'        ;
AS          : 'as'              ;
RETURN      : 'return'          ;
TO          : 'to'              ;
NOT         : 'not'     | '!'   ;
IF          : 'if'              ;
ELSE        : 'else'            ;
WHILE       : 'while'           ;
FOR         : 'for'             ;
STEP        : 'step'            ;
THEN        : 'then'            ;
VAR         : 'var'             ;
TRUE        : 'true'            ;
FALSE       : 'false'           ;
WRITE       : 'write'           ;
READ        : 'read'            ;
TYPEOF      : 'typeof'          ;
DYNAMIC     : 'dynamic'         ;

CONST_TYPE 
    : 'array' 
    | 'bool' 
    | 'int' 
    | 'nil' 
    | 'object'
    | 'float' 
    | 'string'
    ;

TYPE : '<' CONST_TYPE '>' ;


COMPARE_OP
    : '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    ;

program
    : (PROGRAM ID)? (function | statement)+
    ;

function_list
    : function+
    |
    ;

function
    : FUNCTION name = ID '(' (id_list)? ')' (AS r = CONST_TYPE)?
        statement_list
      END FUNCTION
    ;

statement_list
    : statement+
    |
    ;

statement
    : (CONST_TYPE | VAR) assignment_list                #statementDeclaration
    | ID ('[' i = expression ']')? '=' v = expression   #statementAssignment
    | IF or_expression THEN
        statement_list
        (ELSE IF or_expression THEN statement_list)*
        (ELSE statement_list)?
      END IF                                            #statementIf
    | WHILE or_expression THEN
        statement_list
      END WHILE                                         #statementWhile
    | FOR ID '=' expression TO expression (STEP term)? THEN
        statement_list
      END FOR                                           #statementForAssignment
    | FOR ID TO expression (STEP term)? THEN
        statement_list
      END FOR                                           #statementFor
    | RETURN expression?                                #statementReturn
    | function_call                                     #statementFunctionCall
    ;

expression
    : add_expression
    | or_expression
    | function_call
    ;

add_expression
    : mult_expression op = ('+' | '-') add_expression   #add_expressionAddOp // Maybe rearrange
    | mult_expression                                   #add_expressionMultExpression
    ;

mult_expression
    : term op = ('*' | '/') mult_expression             #mult_expressionMultOp
    | term                                              #mult_expressionTerm
    ;

term
    : '(' expression ')'                                #termExpression
    | ID ('[' i = expression ']')?                      #termVariable
    | CONST_INT                                         #termInt
    | CONST_FLOAT                                       #termFloat
    | CONST_STRING                                      #termString
    | function_call #termFunctionCall
    ;

or_expression
    : and_expression OR and_expression                  #or_expressionOp
    | and_expression                                    #or_expressionAnd
    ;

and_expression
    : bool_term AND bool_term                           #and_expressionOp
    | bool_term                                         #and_expressionTerm
    ;

bool_term
    : '(' or_expression ')'                             #bool_termExpression
    | add_expression COMPARE_OP add_expression          #bool_termCompare
    | b = (TRUE | FALSE)                                #bool_termConst
    | NOT bool_term                                     #bool_termNot
    ;

assignment_list
    : ID assignment ( | ',' assignment_list)            #assignmentListNonArray
    | '[]' ID ('=' '(' expression_list ')')? ( | ',' assignment_list) #assignmentListArray
    ;

assignment
    : '=' expression
    | 
    ;

expression_list
    : expression (',' expression)*
    ;

id_list
    : ID (',' ID)*
    ;

function_call
    : WRITE '(' expression_list ')'                     #functionCallWrite
    | ID ('(' expression_list ')')?                     #functionCallId
    | DYNAMIC '(' ID ')'                                #functionCallDynamic
    | CONST_TYPE '(' expression ')'                     #functionCallCast
    | TYPEOF '(' expression ')'                         #functionCallTypeof
    | READ                                              #functionCallRead
    ;

CONST_INT : '-'? CONST_NATUAL_NO ;
CONST_NATUAL_NO : ('0' | POSITIVE_DIGIT DIGIT*) ;

CONST_FLOAT : CONST_INT '.' DIGIT+
            | '.' DIGIT+
            ;

CONST_STRING
            : CONST_NORMAL_STRING | CONST_CHAR_STRING
            ;

CONST_NORMAL_STRING
    : '"' ( ESCAPE_CHAR | ~('\\'|'"') )* '"' 
    ;

CONST_CHAR_STRING
    : '\'' ( ESCAPE_CHAR | ~('\''|'\\') )* '\''
    ;

fragment ESCAPE_CHAR
    : '\\' [nrt"'\\]
    | '\\' '\r'? '\n'
    ;

POSITIVE_DIGIT : [1-9] ;
DIGIT : POSITIVE_DIGIT | '0' ;

ID : [a-zA-Z_$][a-zA-Z0-9_$]* ;

COMMENT: '/*' .*? '*/'                        -> skip;
LINE_COMMENT: ('//' | '#' | '--') ~[\r\n]*    -> skip;
WS: [ \t\r\n\u000C]+                          -> channel(HIDDEN);

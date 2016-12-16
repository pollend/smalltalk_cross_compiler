grammar Smalltalk;

script: ( expression '.' | comment | temporaries | method )* EOF;

method: message_pattern primitive_number? temporaries? expression_series;
message_pattern: unary_selector | (binary_selector variable_name) | (keyword variable_name)+;
primitive_number: LEFT_ARROW PRIMATIVE COLON number RIGHT_ARROW;
temporaries: PIPE  variable_name* PIPE;
expression_series: (expression '.' | comment | temporaries )* ( CARET? expression)?;
expression: (variable_name ASSIGNMENT)? (primary | message_expression (';' cascade_message)*);
unit: variable_name | literal | block | OPEN_PAREN expression CLOSE_PAREN;
primary: unit | unary_expression;
message_expression: unary_expression | binary_expression | keyword_expression;
cascade_message: unary_message | binary_message | keyword_message;
unary_expression: unit unary_message+;
binary_expression: primary binary_message+;
keyword_expression: (binary_expression | primary) keyword_message;
unary_message: unary_selector;
binary_message: binary_selector primary;
keyword_message: keyword (binary_expression | primary) (keyword (binary_expression | primary))*;
block: OPEN_SQUARE ((COLON variable_name)* PIPE)? expression_series CLOSE_SQUARE;
keyword: IDENTIFIER COLON;
binary_selector: MINUS | SELECTOR_CHARACTER+; /*need to fix*/
unary_selector: IDENTIFIER;
literal: number | string | character_constant | symbol_constant | array_constant;
array_constant: HASH array;
array: OPEN_PAREN  (number | symbol | string | character_constant | array | SEPARATOR)+ CLOSE_PAREN;
number:NUMBER;
string: STRING;
character_constant: CHARACTER_CONSTANT;
symbol_constant: HASH symbol;
symbol: unary_selector | binary_selector | keyword+;
identifier: IDENTIFIER;
variable_name: IDENTIFIER;
comment:COMMENT;

CARET: '^';


PRIMATIVE: 'primitive';
//NUMBER
NUMBER: (DIGITS 'r')?  '-'? BIG_DIGITS+ ('.' BIG_DIGITS)? ('e' '-'? DIGITS)?;


IDENTIFIER: LETTER ( LETTER | DIGIT )*;
COMMENT: DOUBLE_QUOTE (CHARACTER | DOUBLE_QUOTE DOUBLE_QUOTE| SINGLE_QUOTE | SEPARATOR )+ DOUBLE_QUOTE ;
CHARACTER_CONSTANT: DOLLAR (CHARACTER |  SINGLE_QUOTE | DOUBLE_QUOTE);
STRING: SINGLE_QUOTE (CHARACTER| SINGLE_QUOTE SINGLE_QUOTE | DOUBLE_QUOTE | SEPARATOR)+ SINGLE_QUOTE;

DIGIT: [0-9];
DIGITS: DIGIT DIGIT?;
BIG_DIGITS:BIG_DIGIT+;
BIG_DIGIT: DIGIT | [A-Z];
LETTER: [a-zA-Z];

MINUS: '-';
CLOSE_PAREN: ')';
OPEN_PAREN: '(';
PIPE: '|';
COLON: ':';
SELECTOR_CHARACTER: '+' | '/' | '\\' | '*' | '~' | '<' | '>' | '=' | '@' | '%'  | '|' | '&' | '?' | '!' | ',';
CLOSE_SQUARE: ']';
OPEN_SQUARE: '[';

SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
DOLLAR: '$';
HASH: '#';
SEPARATOR : [ \t\r\n]+ -> skip;
ASSIGNMENT : ':=';
CHARACTER: SELECTOR_CHARACTER | DIGIT | LETTER;
SEMICOLON: ';';


LEFT_ARROW: '<';
RIGHT_ARROW:'>';

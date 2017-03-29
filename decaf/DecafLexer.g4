grammar DecafLexer;

program		: 'class' 'Program' '{' (decl)* '}';
decl	 	: id | wordR;


letter		: [a-Za-Z]+;


number		: [0-9]+;
id		: ("_" letter);
wordR		: 'boolean' | 'break' | 'callout' | 'class' | 'continue' | 'else' | 'false' | 'for' | 'int' | 'return' | 'true' | 'void';
comment		: '//' ~('\n')* '\n';
WS		: [ \t]+ -> skip;

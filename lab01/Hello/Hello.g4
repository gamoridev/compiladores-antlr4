// A grammar called Hello
grammar Hello;
r: 'Hello' ID 'Bye' ID;
ID: [A-z]+;
WS: [ \t\r\n]+ -> skip;

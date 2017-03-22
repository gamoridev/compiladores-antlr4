grammar parsing;

sentence 	: np //np corresponds a noun phrase
		      vp; //vp corresponds a verb phrase

np			: cn //cn corresponds a complex noun
		   	| cv //cv corresponds a complex verb
		   	  pp; //pp corresponds a preposition phrase	  

vp			: cv //cv corresponds a complex verb
			| cv //cv corresponds a complex verb
			  pp; //pp corresponds a preposition phrase

pp 			: prep //prep corresponds a preposition
			  cn; //cn corresponds a complex noun

cn 			: article 
		   	  noun;

cv 			: verb 
			| verb 
			  np;

article 	: 'a' //terminal
			| 'the'; //terminal

noun 		: 'boy' //terminal
			| 'girl' //terminal
			| 'flower'; //terminal

verb 		: 'touches' //terminal
			| 'likes' //terminal
			| 'sees'; //terminal

prep 		: 'with'; //terminal

WS			: [ \t\r\n]+ -> skip; //white-space
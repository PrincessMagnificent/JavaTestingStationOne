/* UNICODE FOR a, A, ž and $*/

// \u0044 is the escape character for unicode but you're not allowed to use escape characters IN COMMENT?!?!?!

class escapeChara {
	public static void main(String[] args) {
		char bigA = '\u0041';
		char lilA = '\u00E1';
		char elvish = '\u01f7'; // use '' and not "" because these are characters
		
		//print em
		System.out.println("my symbols are " + bigA + " \n\r" + lilA + " \n\r" + elvish);
	}
}


/*
U+0061 	a 
U+0062 	b 
U+0063 	c 
010D  
U+0064 	d 
U+0065 	e 
U+0066 	f 
U+0067 	g 
U+0068 	h 
U+0069 	i 
U+006A 	j 
U+006B 	k 
U+006C 	l 
U+006D 	m 
U+006E 	n 
U+006F 	o 
U+0070 	p 

U+0072 	r 
U+0073 	s 
0161
U+0074 	t 
U+0075 	u 
U+0076 	v 

U+007A 	z  
017E

*/
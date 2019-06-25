/* first for loop in creation */

// while works while it's true
// do while works at least once no mater if it's true or not

class firstFor {
	public static void main(String[] args) {
		int vsota = 0;
		int n = 10;
		
		for (int i = 1; i <= n; i++) 
		{
			vsota = vsota + i;
		}
		System.out.println("vsota prvih " + n + " naravnih stevil je " + vsota); // you can break a println into multiple lines if you end a line on a +
	}
}
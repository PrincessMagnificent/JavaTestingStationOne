/* naloga 7, BIG GIGA TRUTH, CHECK VALIDITY OF 3 <= 4, 4!=5, (3+2 <6 || 1 > 2), 5+5 <3 && 6 > 2 */

class truCheck {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//
		boolean a = 3 <= 4;
		boolean b = 4 != 5;
		boolean c = 3 + 2 < 6 || 1 > 2;
		boolean d = 5 + 5 < 3 && 6 > 2;
		//so it's complaining about dead code because c and d are false, I think.
		// ah no, it's because 1 is nevr larger than 2
		// added supression of warnings
		
		System.out.println(a + " " + b + " " + c + " " + d);
	}
}
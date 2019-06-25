/*use for to multiply the first 8 even numbers. Then print half of the result*/
public class OsemSodih {

	public static void main(String[] args) {
		int rezultat = 1;
		for (int i = 1; i<=8; i++) 
		{
			rezultat = rezultat * i * 2;
		}
		System.out.println(rezultat);
		System.out.println("half is " + rezultat/2);

	}

}

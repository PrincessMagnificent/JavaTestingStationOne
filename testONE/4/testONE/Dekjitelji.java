package testONE;

public class Dekjitelji {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int stevec = 1;
		
		System.out.println("Deljitelji stevila " + n + " : ");
		while (stevec <=n) 
		{	
			if (n % stevec == 0)
			{
				System.out.println(stevec);
			}
			stevec++;
		}
	}

}


public class Decrypter {
	public static void decryption(int n) {
		   
		   int fourth = n%10;
		   int third = (n/10)%10;
		   int second = (n/100)%10;
		   int first = (n/1000)%10;
		   
		   if(fourth < 7) {
			   fourth+=10;
		   }
		   int nFourth = fourth - 7;
		   
		   if(third < 7) {
			   third+=10;
		   }
		   int nThird = third - 7;
		   
		   if(second < 7) {
			   second+=10;
		   }
		   int nSecond = second - 7;
		   
		   if(first < 7) {
			   first+=10;
		   }
		   int nFirst = first - 7;
		  

	System.out.printf("%d%d%d%d\n", nThird, nFourth, nFirst, nSecond);
	
	}
}

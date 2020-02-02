
public class Encrypter{
   public static void encription(int n) {
	int fourth = n%10;
   int third = (n/10)%10;
   int second = (n/100)%10;
   int first = (n/1000)%10;
   
   int nFourth = (fourth + 7)%10;
   int nThird = (third + 7)%10;
   int nSecond = (second + 7)%10;
   int nFirst = (first + 7)%10;
   
   
   
   System.out.printf("%d%d%d%d\n", nThird,nFourth,nFirst,nSecond);
   

   
}
}

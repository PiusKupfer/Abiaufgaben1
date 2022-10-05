
public class fibonacci {

	public static void main(String[]args) {
		int vlStelle=1;
		int lStelle =1;
		int Stelle = 2;
		int i=4;
		int tmp = 2;
		System.out.println("Stelle "+ 1 + "  = " + vlStelle );
		System.out.println("Stelle "+ 2 + "  = " + lStelle );
	System.out.println("Stelle "+ 3 + "  = " + Stelle );
		while(i<50) {
			
			tmp = Stelle;
			vlStelle = lStelle;
			lStelle = tmp;
			Stelle = lStelle + vlStelle;
			
			
			System.out.println("Stelle "+ i + "  = " + Stelle );
			
			
			i++;
		}
	
	}
	
}

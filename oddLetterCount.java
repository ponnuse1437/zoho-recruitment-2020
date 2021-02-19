import java.util.scanner;

public class oddLetterCount {

	public static void mail (String args[]) {
		
		String str
		int n = 0;
		int m =0;
		Scanner in = new Scanner(System.in);
		System.out.println("Input: ");
		str = in.nextLine();
		n = str.length()/2;
		m = str.length()/2;
		for (int i=0; i<= str.length(); i++) {
			for (int j=0; j<= str.length();j++) {
				system.out.println(str.charAt(n));
				n++;
				if(n = str.length()) {
					n=0;
				}	
			}
			m++;
			if(m = str.length()) {
				m=0;
			}
			
		}
	}
}

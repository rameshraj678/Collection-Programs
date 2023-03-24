package Collection.Pragrames;

public class Palindrome {

	public static void main(String[] args) {
	
		//\\\\\\ Palindrome 1st approch////\\\\\
		
//		
//		String s = "MADAM";
//		
//		String rev="";
//		
//		for (int i<s.length()-1;i>0;i--){
//			
//			rev=rev+s.charAt(i);
//		}
//		
//		System.out.println(rev);
//	
//		if(s.equalsIgnoreCase(rev)) {
//			
//			System.out.println("given sentance is palindrome");
//		}
//		else
//		{
//			System.out.println("not a palindrome");
//		}
	
	
		// \\\\\\ Palindrome 2nd approch////\\\\\	
		
		
		
//	String s = "RamesH";
//	String rev ="";
//		
//	String name =new StringBuilder(s).reverse().toString();
//	
//	System.out.println(name);
//	if(s.equalsIgnoreCase(name)) {
//		System.out.println("given string is Palindrome");
//	}
//	
//	else {
//		
//		System.out.println("not a palindrome");
//	}
		
		
	
	// \\\\\\ Palindrome 3rd approch////\\\\\
	
	
		String s= "Madam";
		s=s.toLowerCase();
		String rev ="";
	
//		System.out.println(palindrome1(s));
	
		System.out.println(s);
		
		
		}

	public static String palindrome1(String r) {
		char value[] = r.toCharArray();
		
		int i=0;
		int j=r.length()-1;
	
		while (j>i) {
			if(value[i]!=value[j]) {
				return "Not a Poly";
			}
			++i;
			--j;
		
		
	}
		return"polindrom";
	}
}

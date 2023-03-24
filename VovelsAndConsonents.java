package Collection.Pragrames;

public class VovelsAndConsonents {
	
	public static void main(String[] args) {

	//  find the how many vovel and consonents in the given sentence 
		
		int vCount= 0,  oCount=0;
		
		
		
		String s =" I am a  business man";
		
			
		s=s.toLowerCase();
		
		char [] r = s.toCharArray();
	
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ) {
				
				vCount++;
			}
				else if( s.charAt(i)>='a'&& s.charAt(i)<='z') {
					oCount++;
				}
			}
			System.out.println( "voles in the sentence: "+ vCount);
			System.out.println("consonents in the sentancec "+ oCount);
		

// single charter vovel or consonenet
	
//	char ch ='a';
//	
//	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//		
//		System.out.println(ch + ":vovel");
//	}
//	
//	else
//		System.out.println(ch + ":consonent");
//	
	

// single charter vovel or consonenet using |||||switch case|||||| 
	
//		char ch = 'a';
//	
//	switch (ch) {
//	case 'a':
//	case 'e':
//	case 'i':
//	case 'o':
//	case 'u':
//		
//	System.out.println(ch +" "+"is vovel");
//	break;
//	default:
//	System.out.println(ch +" "+"is consonent");


	}
	
	
	
}


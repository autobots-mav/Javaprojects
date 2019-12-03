package Learning;

public class Reverse {
	public static void main(String[] args) {
		char[] ch = { 'm','a','v','e','r','i','c'};
		String s= String.valueOf(ch);
		System.out.println(s);
	 String Reverse="";
        int length= s.length();
	for( int i=0; i<1; i++)
 	{
		 for(int j=0;j<1;j++)
	 {
 			for(int k=length-1;k>=0;k--)
			{
 					Reverse=Reverse+s.charAt(k);
	 				System.out.println(Reverse);
	 			}
	 		
 	}
	 	}

	}

}

package seleniumTraining;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] text = { 'M', 'A', 'V', 'E', 'R', 'I', 'C' };
		//String text1 = String.valueOf(text);
		String text1=new String(text);
		System.out.println(text1);
		int len = text1.length();
		String reverse = "";

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + text1.charAt(i);

		}
		System.out.println(reverse);

	}

}

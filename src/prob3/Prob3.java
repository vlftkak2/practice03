package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		int length=str.length(); //배열의 길이
		char[] result=new char[length]; //결과 배열을 만들기
		for(int i=0; i<length; i++){
		
			result[i]=str.charAt(length-1-i);
		}
		
		return result;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		System.out.println(array);
	}
}

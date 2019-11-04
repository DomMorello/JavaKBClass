package stringPractice;
import java.util.*;
public class StringPractice{

	public static void main(String[] args) {
//		System.out.println(myParseInt("123"));
//		System.out.println(myParseInt("23"));
//		System.out.println(myParseInt("3"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.nextLine();
			if(input.equals("exit")) {
				System.out.printf("입력받은 문자열:'%s'\n",input);
				System.out.println("---변환 루프 종료---");
				break;
			}
			System.out.printf("입력받은 문자열:'%s'\n",input);
			System.out.printf("변환된 수치값:%d, %x\n",myParseInt2(input),myParseInt2(input));
		}
	}
	
	public static int myParseInt(String s) {
		int result = 0;
		for(int i=0; i < s.length(); i++) {
			result += (s.charAt(i)-'0')*(int)(Math.pow(10, s.length()-1-i));
		}
		return result;
	}
	
	public static long myParseInt2(String input) {
		long result = 0;
		for(int i=0; i < input.length(); i++) {
			result += (input.charAt(i)-'0')*(long)(Math.pow(10, input.length()-1-i));
		}
		return result;
	}
}


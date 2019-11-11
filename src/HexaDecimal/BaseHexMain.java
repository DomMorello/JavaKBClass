package hexaDecimal;

public class BaseHexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertHexToDec('A'));
		System.out.println(convertHexToDec('F'));
		System.out.println(convertHexToDec('8'));
		System.out.println(convertHexToDec('0'));
		System.out.println(getValueFromHex("FF"));
		System.out.println(getValueFromHex("ff"));
		System.out.println(getValueFromHex("Ff"));
	}
	
	public static int convertHexToDec(char c) {
		if((int)c >= 48 && (int)c <= 57) {	//1~10일 때는
			return c-'0';	//그대로 정수로 전환해서 리턴
		}else if((int)c >= 65 && (int)c <= 70){	//A~F일 떄는
			return c - 55; //55를 빼서 정수형을 return
		}else if((int)c >= 97 && (int)c <= 102) {	//a~f일 때는
			return c - 87;	//87을 빼서 정수형을 return
		}else {
			return -1;	//다른 값 넣으면 안 됨.
		} 
			
	}
	
	public static int getValueFromHex(String str) {
		int result = 0;
		for(int i=0; i < str.length(); i++) {
			result += convertHexToDec(str.charAt(i))*(int)(Math.pow(16, str.length()-1-i));
		}	//자릿수마다 16의 n제곱을 해서 그 값을 더하면 10진수로 변환이 가능하다.
		return result;
	}

}

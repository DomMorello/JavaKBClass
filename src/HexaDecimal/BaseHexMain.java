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
		if((int)c >= 48 && (int)c <= 57) {	//1~10�� ����
			return c-'0';	//�״�� ������ ��ȯ�ؼ� ����
		}else if((int)c >= 65 && (int)c <= 70){	//A~F�� ����
			return c - 55; //55�� ���� �������� return
		}else if((int)c >= 97 && (int)c <= 102) {	//a~f�� ����
			return c - 87;	//87�� ���� �������� return
		}else {
			return -1;	//�ٸ� �� ������ �� ��.
		} 
			
	}
	
	public static int getValueFromHex(String str) {
		int result = 0;
		for(int i=0; i < str.length(); i++) {
			result += convertHexToDec(str.charAt(i))*(int)(Math.pow(16, str.length()-1-i));
		}	//�ڸ������� 16�� n������ �ؼ� �� ���� ���ϸ� 10������ ��ȯ�� �����ϴ�.
		return result;
	}

}

package day2;

public class Progarm9_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch ='A';
		System.out.println(ch);
		if(ch>='A'|| ch>='Z'){
			System.out.println("Charater is Uppercase");
		}
		else if (ch>='a'|| ch>='z')
			System.out.println("Charater is Lowercase");
		else if (ch>='0'|| ch>='9')
			System.out.println("Charater is digit");
		else
			System.out.println("special Charater");
	}
	

}

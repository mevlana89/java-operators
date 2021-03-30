package quete_java_operators;

public class Operator {

	public static void main(String[] args) {
		int a = 5, b = 8, c = 9, d = 2;
		
		int j = a + b;
		// j == 13
		j = j * d;
		//j == 26
		j = j%j;
		//j==0
		
		String string = a==b?"yes":"no";
		//string == no
		string = a>=b?"yes":"no";
		//string == yes
		string = a<=b?"yes":"no";
		//string == yes
		string = a!=b?"yes":"no";
		string.getBytes();
		//string == yes
		
		int x = a*a-b+d/d%c;
		// x = 0
		//
	}

}

import java.util. Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
char card=scan.next().charAt(0);

if (card == '2' || card == '3' || card == '4' || card == '5' || card == '6' ||
card == '7' || card == '8' || card == '9' || card == 'T' || card == 'Q' || card == 'J' ||
card == 'K' || card == 'D' || card == 'A'){
System.out.println("Valid card");	
}
else{
	System.out.print("Invalid card");
}
	
	
}
	
	}



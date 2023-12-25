import java.util.Scanner;

public class EvenNumber {
	//Kullanıcının girdiği sayıya kadar olan çift sayıları yazdıra program
	
	public static void main(String[]args) {
	Scanner a= new Scanner(System.in);
	System.out.println("Please enter a number:");
	int k=a.nextInt();
	
	for(int i=0; i<=k; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}

}
	}

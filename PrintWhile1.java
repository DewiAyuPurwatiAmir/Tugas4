import java.util.Scanner;

public class PrintWhile1 {
	
public static void main (String[] args) {
	int i=1,N;
	Scanner masukan=new Scanner (System.in);
	
	System.out.print ("Nilai N>0 = ");
	
	N= masukan.nextInt();
	
	System.out.print ("print i dengan WHILE (ringkas): \n");
	while (i <= N){
	System.out.println (i++);
	}
	}
}
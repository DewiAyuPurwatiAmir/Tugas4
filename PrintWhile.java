import java.util.Scanner;

public class PrintWhile {
	
public static void main (String[] args) {
	int i,N;
	Scanner masukan=new Scanner (System.in);
	
	System.out.print ("Nilai N>0 = ");
	
	N= masukan.nextInt();
	i=1;
	
	System.out.print ("print i dengan WHILE  : \n");
	while (i <= N){
	System.out.println (i);
	i++;
	};
	}
}
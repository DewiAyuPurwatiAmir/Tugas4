import java.util.Scanner;

public class PrintRepeat {
	
public static void main (String[] args) {
	int i,N;
	Scanner masukan=new Scanner (System.in);
	
	System.out.print ("Nilai N>0 = ");
	
	N= masukan.nextInt();
	
	i=1;
	System.out.print ("print i dengan REPEAT  : \n");
	do{
	System.out.print (i+"\n");
	i++;
	}
	while (i <= N);
	}
}
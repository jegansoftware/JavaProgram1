package Java;
import java.util.*;
public class JavaProgram {

public static void main (String[] args) {
	
		//Interest();
		Compound_Interest();
}

private static void Interest() {
	double p,t,n,c,i;
	Scanner in=new Scanner(System.in);
	System.out.printf("Enter Principle Amount :");
	p=in.nextDouble();
	
	
	System.out.printf("Enter Time :");
	t=in.nextDouble();
	
	System.out.printf("Entet Rate of interest :");
	i=in.nextDouble();
	
	c=p*Math.pow(1+i/100,t);
	
	System.out.printf("%f", c);
}


static void Compound_Interest()
{
	Scanner com=new Scanner(System.in);
	double amount=65000;
	double rate=7;
	double s1,s2,s3;
	
	System.out.printf("Enter The Amount :");
	amount=com.nextDouble();
	
	
	System.out.printf("Enter The Rate  :");
	rate=com.nextDouble();
	
	s1=amount*(1+(rate/100)*(30.0/360));
	s2=amount*(1+(rate/100)*(60.0/360));
	s3=amount*(1+(rate*100)*(90.0/360));
	
	
	System.out.printf("\n30= %f ",s1);
	
	System.out.printf("\n30= %f ",s2);
	
	System.out.printf("\n30= %f ",s3);
	
	
}


}

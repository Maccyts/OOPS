import java.util.*;
import java.lang.*;
class Test
{
    static double sqrt(int n)
    {
        double t=0;
        double s=n/2;
        while(s!=t)
        {
            t=s;
            s=(n/t+t)/2;
        }
        return s;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Test t=new Test();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    double d=t.sqrt(n);
	    int x=(int)d;
	    if(x*x==n) 
		System.out.print(x);
		else
		    System.out.printf(d);
	}
}


import java.util.*;
class Test
{
    Test (int n,int r)
    {
        int s=0,b=1;
        while(n!=0)
        {
            int a=n%10;
            if(a!=r)
            {
                s=s+a*b;
                b=b*10;
            }
            n=n/10;
        }
        System.out.print(s);
	}
        
    }
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int r=sc.nextInt();
	    Test t=new Test(n,r);
		
}
}

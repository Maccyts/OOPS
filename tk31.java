import java.util.*;
class Test
{
    int n;
    Test(int n)
    {
        this.n=n;
    }
    boolean prime()
    {
        boolean f=true;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
            f=false;
            break;
            }
        }
       
        return(f);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Test t=new Test(n);
		System.out.print(t.prime()?"primE":"set a primE");
	}
}




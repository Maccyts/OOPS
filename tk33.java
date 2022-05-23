import java.util.*;
class Test 
{
    String s;
    int m1,m2,m3;
    void get(String x,int m1,int m2,int m3)
    {
        s=x;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
}
class Demo extends Test{
    void calc()
    {
        int tot=super.m1+super.m2+super.m3;
        double avg=tot/3;
        System.out.printf("Total:"+tot+" Average:"+avg);
    }
}
public class Main
{
	public static void main(String[] args) {
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		d.get(name,m1,m2,m3);
		d.calc();
	}
}



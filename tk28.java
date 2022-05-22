import java.util.*;
import java.lang.*;
class Test
{
    private String sname;
    void getName(String s)
    {
        sname=s;
    }
    void setName()
    {
        System.out.println("Welcome"+" "sname);
    }
}
public class Main
    {
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        Test m=new Test();
	        m.getName(sc.nextLine());
	        m.setName();
		
	}
}



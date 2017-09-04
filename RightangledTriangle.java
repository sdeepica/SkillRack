package programs;
import java.util.*;
public class RightangledTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		a=a*a;
		b=b*b;
		c=c*c;
		int x=0,y=0,z=0;
		if(a>b&&a>c){
			y=a;
			x=b;
			z=c;
		}
		else if(b>c) {
			y=b;
			x=a;
			z=c;
		}
		else {
			y=c;
			x=a;
			z=b;
		}
		if(y==(x+z)) {
			System.out.println("yes");
			}
		else {
			System.out.println("no");
		}
		s.close();
		
		}

}

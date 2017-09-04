package programs;
import java.util.*;
public class RightTri {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int x=a*a;
		int y=b*b;
		int z=c*c;
		if((x==y+z)||(y==x+z)||(z==x+y)){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		s.close();
	}

}

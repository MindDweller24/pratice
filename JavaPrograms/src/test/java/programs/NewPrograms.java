package programs;

import org.testng.annotations.Test;

public class NewPrograms {
	@Test
	public  void findFactorial() {
	int n=5;
	for(int i=n-1;i>=1;i--)
	{
		n=n*i;	
	}
	System.out.println(n);
	}
	@Test
	public void fibonacci() {
		int fib1=0;
		int fib2=1;
		int fib3;
		for(int i=0;i<=10;i++) {
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.println(fib3+" ");
		}	
	}
	@Test
	public void printTheNumInFormat() {
		//2 6 12 36 72
		int n=1;
		int m=1;
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				System.out.print(n+" "+m);
				n=(n*2);//2 
				m=(m*3);
			}	
			//n=(n*2)+1;
		}
	}
	@Test
public void prime() {
	for(int i=1;i<=30;i++) {
		int count=0;
		for(int j=2;j<=i/2;i++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(i);
		}
	
	}
}
	@Test
	public void square() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void rightangle() {
		int n=5;
		for(int i=1;i<=n;i++) {//1<5t.2<5t
			for(int j=1;j<=i;j++) {//1<=1,2<=1
				System.out.print("* ");//*
				                       //*
			}
			System.out.println(" ");
		}
	}
	@Test
	public void downwardRightangle() {
		int n=5;
//		for(int i=n-1;i>0;i--) {
//			for(int j=i;j>0;j--) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern4() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern5() {
		int n=5;
		for(int i=1;i<=n;i++) {//t,
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	@Test
	public void pattern6() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern7() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	@Test
	public void squareOfNum() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("1 ");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void squarenum() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void squarenum2() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void rightAnglenum2() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void rightAnglenum3() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void rightAnglenum4() {
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=i;j<n;j++) { 
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void rightAnglenum5() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}@Test
	public void printAlphabetsInIncreasing() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print((char)('a'+j)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void printHalfTriangle() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {//for printing spaces
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {//for printing star
				System.out.print("*");
			}
			System.out.println();
		}
	}
	@Test
	public void printNumtriangle() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i++);
			}
		}
	}
	
}

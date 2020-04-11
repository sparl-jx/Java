import java.util.*;
public class Practice {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Random random = new Random();
		int randNum=random.nextInt(100);
		while(true) {
			System.out.println("请输入数字:");
			int num = scan.nextInt();
			if(num<randNum) {
				System.out.println("猜小了");
			}
			else if(num==randNum) {
				System.out.println("猜对了");
				break;
			}
			else if(num>randNum) {
				System.out.println("猜大了");
			}
		}
	}
}



import java.util.*;
public class Practice {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		if(a<=18) {
			System.out.println("少年");
		}
		else if(a>18 && a<=28) {
			System.out.println("青年");
		}
		else if(a>28 && a<=55) {
			System.out.println("中年");
		}
		else if(a>=56) {
			System.out.println("老年");
		}
    }
}




import java.util.*;
public class Practice {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("不是素数");
				break;
			}
			else {
				System.out.println("是素数");
				break;
			}
		}
	}
}





public class Practice {
	public static void main(String[] args) {
		int i=0;
		for(i=1;i<=100;i++) {
			int j=2;
			for(;j<=(int)Math.sqrt(i);j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j>(int)Math.sqrt(i)) {
				System.out.println(i+" ");
			}
		}
	}
}




public class Practice {
	public static void main(String[] args) {
		int year=0;
		for(year=1000;year<2000;year++) {
			if(year%100!=0 && year%4==0 || year%400==0) {
				System.out.println(year);
			}
		}
	}
}


import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=0;
		int j=0;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.println(i+"*" +j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}





import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=0;
		while(a%b !=0) {
			c=a%b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
}




public class Practice {
	public static void main(String[] args) {
		double sum=0;
		int flg=1;
		for(int i=1;i<=100;i++) {
			sum=sum+1.0/i*flg;
			flg=-flg;
		}
		System.out.println(sum);
	}
}




public class Practice {
	public static void main(String[] args) {
		int count=0;
		int i=0;
		for(i=1;i<=100;i++) {
			if(i/10==9) {
				count++;
			}
			if(i%10==9) {
				count++;
			}
		}
		System.out.println(count);
	}
}



import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int count=0;
		while(true) {
			if(i%2==1);
			count++;
			i=i/2;
		}
		System.out.println(count);
	}
}





import java.util.*;
public class Practice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=3;
		while(count!=0) {
			System.out.println("请输入密码");
			String password=scan.nextLine();
			if(password.equals("123456")) {
				System.out.println("密码正确,登录成功");
				break;
			}
			else {
				count--;
				System.out.println("输入错误，你还有"+count+"次机会");
			}
		}
	}
}





import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		int count=0;
		while(n!=0) {
			if((n&1)==1) {
				count++;
			}
			n=n>>1;
		}
		System.out.println(count);
	}
}

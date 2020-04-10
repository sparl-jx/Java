/*public class TestDemo {
	public static void main1(String[] args) {
		long a=10L;
		System.out.println("a的值是:" + a);
		System.out.println("最大值是:" + Long.MAX_VALUE);
		System.out.println("最小值是:" + Long.MIN_VALUE);
	}
}


public class TestDemo {
	public static void main(String[] args) {
		double d=12.5;
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
}


public class TestDemo {
	public static void main(String[] args) {
		int a=1;
		System.out.println(a);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}


public class TestDemo {
	public static void main(String[] args) {
		float f=12.3;
		System.out.println(f);
	}
}




public class TestDemo {
	public static void main(String[] args) {
		char ch='a';
		System.out.println(ch);

	
		char ch2=97;
		System.out.println(ch2);
	}
}


public class TestDemo {
	public static void main(String[] args) {
		byte b=12;
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}
}



public class TestDemo {
	public static void main(String[] args) {
		short sh=12;
		System.out.println(sh);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}
}



public class TestDemo {
	public static void main(String[] args) {
		boolean flg=false;
		System.out.println(flg);
	}
}



public class TestDemo {
	public static void main(String[] args) {
		int i=2147483647+1;
		int i2=Integer.MAX_VALUE+1;
		System.out.println(i);
		System.out.println(i2);
	}
}



public class TestDemo {
	public static void main(String[] args) {
		byte b =10;
		byte c =20;
		byte d=(byte)(b+c);
		System.out.println(d);
	}
}
*/



public class TestDemo {
public static void main(String[] args) {

    int num = 5;
    int i = 1;
    int ret = 1;
    int sum=0;
    while(i <= num) {
        ret *= i;
        sum+=sum;
        i++;
    }

System.out.println(ret);
}

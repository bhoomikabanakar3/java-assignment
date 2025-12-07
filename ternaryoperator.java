package placementprograms;

public class ternaryoperator {

	public static void main(String[] args) {
           int a= 10;
           int b=100;
           int c=300;
           int d=1000;
           int e=690;
           
           String f=(a>b)&&(a>c)&&(a>d)&&(a>e)? "greatest="+a: (b>c)&&(b>d)&&(b>e)? "greatest="+b: (c>d)&&(c>e)? "greatest="+c: (d>e)? "greatest="+d:"greatest="+e;
           System.out.println(f);
        

	}

}

package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class FourthPrimeFactor {
/*��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
	�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
	(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ� 
	(2)���n>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ���� 
	(3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ���� 
*/
	static int k=2;
	public void f(int n) {
	   while(k <= n) {
	    if(k == n) {
	     System.out.println(n);
	     break;
	    } else if(n > k && n % k == 0) {
	     System.out.print(k + "*");
	     n = n / k; 
	     f(n);
	     break;
	    } else if(n > k && n % k != 0) {
	     k++;
	     f(n);
	     break;
	    }
	   }
	}
	
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();		
	System.out.print(n+"=");
	FourthPrimeFactor f=new FourthPrimeFactor();
	f.f(n);
}
}

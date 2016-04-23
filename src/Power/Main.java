package Power;

import javax.naming.spi.DirStateFactory.Result;

import MergeTwoList.ListNode;

/**
 * Implement pow(x, n).

Subscribe to see which companies asked this question
 * @author linxj
 *
 */
public class Main {
	public static void main(String[] args){
		System.out.println(pow(2,2));
	}
	public static double pow(double d,int n){
		boolean flag = false;
		boolean zhisuFlag = false;
		int e = n;
		if(n<0){
			e = -n;
			zhisuFlag = true;
			if(d == 0.0){
				return 0;
			}
		}
		if(n%2==1&&d<0){
			flag = true;//¸ºÊý
		}
		double result = power(d, e);
		if(zhisuFlag){
			result = 1/result;
		}
		if(flag){
			result = -result;
		}
		return result;
		
	}
	public static double power(double d,int n){
		
		if(n == 1){
			return d;
		}
		if(n == 0){
			return 1;
		}
		double  result = d;
		int k = 1;
		int pn = n;
		while (n/2>0) {
			n = n/2;
			result = result*result;
			k = k*2;
		}
			result =result * power(pn, n-k);
			return result;
		}
	
}

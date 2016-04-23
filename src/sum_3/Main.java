package sum_3;

import java.util.Arrays;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 *  Find all unique triplets in the array which gives the sum of zero.
 *  从一个数组中找三个数，让它们的和为0。输出所有可能。
 *  For example, given array S = {-1 0 1 2 -1 -4},
    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
 * @author linxj
 *
 */
public class Main {
	public static void main(String[] args){
		int[] array = {-1, 0,1,2,-1,-4};
		print3Num(array, 0);
	}
	public static void print3Num(int[] array,int k){
		Arrays.sort(array);
		int length = array.length;
		if(array == null||array.length<=0){
			 return ;
		}
		for(int i = 0;i < length;i++){
			if(i<length-1&&array[i] == array[i+1]){
				continue;
			}
			int num = k-array[i];
			
			printK(array,i,length-1,array[i],num);
		}
		
		
	}
	public static void printK(int[] array,int start,int end, int num,int k){
		
		/*int start = 0;
		int end = length - 1;*/
		//boolean flag = false;
		
		while(start < end){
			while(array[start] == array[start+1]){
				start++;
			}
			while(array[end] == array[end-1]){
				end--;
			}
			if(array[start] + array[end] == k){
				System.out.println(num+" "+array[start]+" "+array[end]);
				start ++;
			}
			if(array[start]+array[end] < k){
				start++;
			}
			if(array[start]+array[end] > k){
				end--;
			}
		}
		//System.out.println("can't find");
	}
}

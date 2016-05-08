package Permutations_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		int[] nums = {1,2,3};
		List<List<Integer>> result = permute(nums);
	}
public static List<List<Integer>> permute(int[] nums) {
	List<List<Integer>> result = new ArrayList<>();
	permute(nums, 0, nums.length, result);
	return result;
    }
public static void permute(int[] nums,int begin,int length,List<List<Integer>> result){
	
	if(begin >= length){
		ArrayList<Integer> aList = new ArrayList<Integer>();
		//System.out.println(nums);
		for(int i = 0;i < nums.length;i++){
			aList.add(nums[i]);
			System.out.print(nums[i]);
		}
		System.out.println();
		result.add(aList);
		return;
	}
	for(int i = begin;i < nums.length;i++){
		swap(nums, begin, i);
		permute(nums, begin+1, length, result);
		swap(nums, begin, i);//»»»ØÀ´
	}
}
public static void swap(int[]nums,int left,int right){
	int temp = nums[left];
	nums[left] = nums[right];
	nums[right] = temp;
	
}
}

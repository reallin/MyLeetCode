package MergeSort;
/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one 
 * sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n)
 to hold additional elements from nums2. The number of elements initialized in nums1
  and nums2 are m and n respectively.
 * @author linxj
 *思路：从后往前遍历，放的最后位子
 */
public class Main {
	public static void main(String[] args){
		int[] a = {0};
		int[] b = {1};
		merge(a,0,b,1);
		for(int i = 0;i < a.length;i++)
		System.out.print(a[i]+" ");
	}
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
	     if(nums1==null||nums2==null||m<0||n<0){
	    	 return;
	     }
	    
	     int index = m+n-1;
	     int index1 = m-1;
	     int index2 = n-1;
		 while(index1>=0&&index2>=0){
			 if(nums1[index1]<nums2[index2]){
				 nums1[index--] = nums2[index2--];
				 
			 }else{
				 nums1[index--] = nums1[index1--];
			 }
		 }
		 while(index1>=0){
			 nums1[index--] = nums1[index1--];
		 }
		 while(index2>=0){
			 nums1[index--] = nums2[index2--];
		 }
	    }
}

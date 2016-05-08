package RemoveElement;
/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
意思就是数组删除一个值，返回一个数组长度，在这个长度之前的数组是删除后的数组。
 * @author linxj
 *
 */
public class Main {
	 public int removeElement(int[] nums, int val) {
		 int count = 0;
	        for(int i = 0;i < nums.length;i++){
	        	if(val != nums[i]){
	        		nums[count] = nums[i];
	        		count++;
	        	}
	        }
	        return count;
	    }
}

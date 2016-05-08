package RemoveElement;
/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
��˼��������ɾ��һ��ֵ������һ�����鳤�ȣ����������֮ǰ��������ɾ��������顣
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

package Solution;

import java.util.Scanner;

/*Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class leetCode_3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		lengthOfLongestSubstring(scanner.nextLine());
		//}
	}
	    public static int lengthOfLongestSubstring(String s) {
	        int start = 0;
	        int end = 1;
	        int max = 0;
	        int pos = 0;
	        while(start<end&&end<s.length()){
	        	/*if(end < s.length()-1){
	        		pos = end +1;
	        	}else{
	        		pos = end;
	        	}*/
	            
	             while(isExit(s.substring(start,end+1),s.charAt(end))){
	            	 if(end-start==1){
	 	            	//end++;
	 	            	break;
	 	            }
	                start++;
	            }
	             while(!isExit(s.substring(start,end+1),s.charAt(end))){
		              if(end<s.length())  
		                end++;
		            }
	            int diff = end - start;
	            if(max < diff){
	                max = diff;
	            }
	        }
	        return max;
	    }
	    public static boolean isExit(String str , char a){
	        for(int i = 0;i < str.length();i++){
	            if(str.charAt(i)==a){
	                return true;
	            }
	        }
	        return false;
	    }
	
}

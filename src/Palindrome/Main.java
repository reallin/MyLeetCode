package Palindrome;

public class Main {
	public static void main(String[] args){
		System.out.println(isPalindrome("......a....."));
		System.out.println(isPalindrome("09"));
	}
public static boolean isPalindrome(String s) {
	s = s.toLowerCase();
	if(s.length()<=1){
		return true;
	}
        int length = s.length();
        int start = 0;
        int end = length-1;
        
        while(start < end){
        	while(start<end&&!isAlpha(s.charAt(start))){
        		start++;
        	}
        	
        	while(start<end&&!isAlpha(s.charAt(end))){
        		end--;
        	}
        	if(s.charAt(start)!=s.charAt(end)){
        		return false;
        	}
        	start++;
        	end--;
        }
        return true;
    }
public static boolean isAlpha(char s){
	if(s>='a'&&s<'z'||s>='0'&&s<='9'){
	//	s=(char)(s-'a'+'A');
		return true;
	}
	else{
		return false;
	}
}
}

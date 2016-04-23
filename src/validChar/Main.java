package validChar;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Subscribe to see which companies asked this question
 * @author linxj
 *
 */
public class Main {
	public static void main(String[] args){
		System.out.println(valid("["));
	}
	public static boolean valid(String str){
		if(str.length() <= 0){
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		int length = str.length();
		for(int i = 0;i < length;i++){
			if(str.charAt(i) == '{'||str.charAt(i) == '['||str.charAt(i)=='('){
				stack.push(str.charAt(i));
			}
			if(str.charAt(i)==')'){
				if(!stack.isEmpty()){
				char c = stack.pop();
				if(c != '('){
					return false;
				}
				}else{
					return false;
				}
			}
			if(str.charAt(i)=='}'){
				if(!stack.isEmpty()){
				char c = stack.pop();
				if(c != '{'){
					return false;
				}
				}else{
					return false;
				}
			}
			if(str.charAt(i)==']'){
				
				if(!stack.isEmpty()){
					char c = stack.pop();
				if(c != '['){
					return false;
				}
			}else{
					return false;
				}
			}
		}
		if(stack.isEmpty())
		return true;
		else{
			return false;
		}
	}
}

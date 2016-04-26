package GenerateParentheses_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * Subscribe to see which companies asked this question
 * 
 * @author linxj
 *思路：先加“(”,如果剩余的“(”比")"多，则不符合规则，不能放")",只能放“（”
 */
public class Main {
	public static void main(String[] args){
		generateParenthesis(1);
	}
	public static List<String> generateParenthesis(int n) {
		ArrayList<String> aList = new ArrayList<String>();
		if(n <= 0){
			return null;
		}
		 getList(n,n,"",aList);
		 return aList;
		
	}
	public static void getList(int left,int right,String curStr,List<String> aList){
		if(left > right){
			return;
		}
		if(left == 0&&right == 0){
			aList.add(curStr);
		}
		if(left > 0){
			getList(left-1, right, curStr+"(", aList); 
		}
		if(right > 0){
			getList(left, right-1, curStr+")", aList);
		}
		
	}
}

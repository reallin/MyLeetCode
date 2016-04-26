package WordLadder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the word list
For example,

Given:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * @author linxj
 *思路：类似找最小路径，只是权值都为1.用BFS。构造的时候用了点小技巧，把每个字母每一位从‘a’遍历到‘z’。时间复杂度只为（length*26）*n。
 */
public class Main {
	public static void main(String[] args){
		Set<String> wList = new HashSet<String>();
		
		//String[] wordList = {"hot","dot","dot","lot","log"};
		/*wList.add("hot");
		wList.add("dot");
		wList.add("dog");
		wList.add("lot");
		wList.add("log");*/
		wList.add("a");
		wList.add("b");
		wList.add("c");
		
		System.out.println(ladderLength("a", "c", wList));
	}
	 public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
	        if(isOneDiff(beginWord, endWord)){
	        	return 2;
	        }
	        if(beginWord.length()<=0||endWord.length()<=0||beginWord.equals(endWord)  
	                || beginWord.length() != endWord.length()){
	        	return 0;
	        }
	        //int depth = 0;
	        Queue<String> queue = new LinkedList<String>();
	        HashMap<String,Integer> dist=new HashMap<String,Integer>(); 
	        queue.add(beginWord);
	        dist.put(beginWord, 1);
	        while (!queue.isEmpty()) {
	        	
	        	String start = queue.poll();
	        	int depth = dist.get(start);
	        	for(int i = 0;i < start.length();i++){
	        		for(int j = 0;j < 26;j++){
	        			if(start.charAt(i)==(char)('a'+j)){
	        				continue;
	        			}
	        			StringBuilder sBuilder = new StringBuilder(start);
	        			sBuilder.setCharAt(i, (char)('a'+j));
	        			if(sBuilder.toString().equals(endWord)){
	        				//depth++;
	        				return depth+1;
	        			}
	        			if(wordList.contains(sBuilder.toString())&&!dist.containsKey(sBuilder.toString())){//出现过的不需要再添加
	        				
	        				dist.put(sBuilder.toString(), depth+1);
	        				queue.add(sBuilder.toString());
	        			}
	        		}
	        	}
			}
	        return 0;
	        
	    }
	 public static boolean isOneDiff(String start,String end){
		 int diff = 0;
		 for(int i = 0;i<start.length();i++){
			 if(start.charAt(i) != end.charAt(i)){
				 diff++;
				 if(diff>=2){
					 return false;
				 }
			 }
		 }
		 return diff == 1;
	 }
}

package code01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	
	public String[] letter_map = {" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
    	int n = digits.length();
    	if(n == 0) {
    		return null;
    	}
    	dfs(new StringBuilder(),0);
    	return ans;
    }
    public void dfs(StringBuilder path,int n) {
    	if(path.length() == n   ) {
    		ans.add(path.toString());
    		return;
    	}
    	for(char c :letter_map[n].toCharArray()) {
    		path.append(c);
    		dfs(path,n+1);
    		path.deleteCharAt(path.length()-1);
    	}
    }
    
    

    
    
   public static void main(String[] args) {
	   Solution s1 = new Solution();
	   List<String> letterCombinations = s1.letterCombinations("23");
	   System.out.println(letterCombinations);
  }
	
	
}

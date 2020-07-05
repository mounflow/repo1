package code;

import java.util.HashMap;
import java.util.Map;

public class LengthofLongestsubstring {
	
	public static int solution(String str) {
		
		int len = 0;
		Map<Character,Integer> map = new HashMap();
		for(int j = 0,i = -1; j < str.length(); j++) {
			if(map.containsKey(str.charAt(j))) {
				i++;
			}
			len = Math.max(len,j-i);
			map.put(str.charAt(j),j);
		}
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "pwwkew";
          System.out.println(solution(str));
	}

}

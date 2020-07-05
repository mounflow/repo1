package code;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {
	
	public  static int [] Sum(int []nums,int target) {
		Map<Integer,Integer> map = new HashMap();
		for(int i = 0;i<nums.length;i++) {
			map.put(nums[i], i);
			if(map.containsKey(target-nums[i])) {
				int [] result = {map.get(target-nums[i]),i};
				return result;
			} 
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums [] = {9,1,4,5,3,5};
        int []result = Sum(nums,10);
        System.out.println("第一个数"+result[0]+" 第二个数"+result[1]);
	}

}

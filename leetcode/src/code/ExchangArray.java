package code;

import java.util.HashMap;
import java.util.Map;

public class ExchangArray {
	
	public static int[] exchange(int []num) {
		  
		  if(num!=null&&num.length!=0){
			  int low=0,high=num.length-1;
			  while(low<high){
				    while(low<high&&num[low]%2==1) low++;
				    while(high>low&&num[high]%2==0) high--;
				    int T = num[low];
				    num[low] = num[high];
				    num[low] = T;
			   }
	        }
	     return num;
	}
	
	
	public static int dinf(String str) {
		int len=0;
		if(str==null||str.length()==0) return 0;
		else {
		 Map<Character,Integer> dd = new HashMap();
		 for(int i = 0;i<str.length();i++) {
			 if(dd.containsKey(str.charAt(i))) {
				 
			 }
				
		 }
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,5,4,34,23,4,2,3,42,4};
		nums = exchange(nums);
		for(int i:nums)
			System.out.print(i+" ");
		System.out.println();
	}

}

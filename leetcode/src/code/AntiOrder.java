package code;

import java.util.Arrays;

public class AntiOrder {
public static int reverserPair(int []nums) {
		return merge(nums,0,nums.length-1);
	}
	public static int merge(int []nums,int start,int end) {
		
		if(end+1-start==1)
			return 0;
		else {
			int T=0;
			int new_end = (start+end)/2;
			int new_start = new_end+1;
			T+=merge(nums,start,new_end)+merge(nums,new_start,end);
			int next_i =start;
			int i=new_start;
			
			boolean flag=true;  // 观察有交换 
			while(i<=end&&flag) {
				flag = false;
				int j = next_i; 
				while(j<=new_end) {
					if(nums[i]<nums[j]) {
						flag = true;
						T +=new_end-j+1;
						int m =new_end;
						int NB = nums[i];
						while(m>=j) {
							nums[m+1]=nums[m];
							m--;
						}
						nums[j]=NB;
						next_i = j+1;
						new_end++;
						break;
					}
					j++;
				}
				i++;
			}
			return T;
		}
		
	}
	
	public static void main(String args[]) {
		int array[]= {7,6,3,2,1};
			System.out.print(reverserPair(array));
	}
}

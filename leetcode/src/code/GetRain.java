package code;

import java.util.Stack;

public class GetRain {
	  /*
	   * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
	   * 链接：https://leetcode-cn.com/problems/trapping-rain-water/
	   * 官解：https://leetcode-cn.com/problems/trapping-rain-water/solution/jie-yu-shui-by-leetcode/
	   */

	  public static int trap(int[] height) {
	       int water = 0;
	     //  int left_max = 0,right_max =0;
	       int len = height.length;
	       int []left_max = new int[len];
	       int []right_max = new int[len];
	       left_max[0]=height[0];
	       for(int i=1;i<len;i++) 
	    	   left_max[i]=Math.max(left_max[i-1], height[i]);
	       right_max[len-1]=height[len-1];
	       for(int i=len-2;i>=0;i--) 
	    	   right_max[i]=Math.max(right_max[i+1], height[i]);
	       for(int i=0;i<len;i++) {
	    	  int level = Math.min( left_max[i],right_max[i]);
	    	   water+=level-height[i];
	       }
	    	return water;  
	   }
	  
	  // 维护一个递减栈
	 
	  public static int trap2(int[] height) {
		  int ans = 0,current =0;
		  Stack<Integer> st = new Stack<Integer>();
		  while(current<height.length) {
			  while(!st.empty()&&height[current]>height[st.peek()]) {
				  int top = st.peek();
				  st.pop();
				  if(st.empty())
					  break;
				  int distance = current -st.peek()-1;
				  int bouned_height = Math.min(height[current], height[st.peek()])-height[top];
				  ans+=distance*bouned_height;
			  }
			  st.push(current++);
		  }
		  return ans;
	  }
	  
	  // 双指针
	  public static int trap3(int[] height) {
		  int ans=0;
		  int left_max = 0;
		  int right_max =0;
		  int left =0;
		  int right = height.length-1;
		  while(left<right) {
			  if(height[left]<height[right]) {
				  if(height[left]>left_max) {
					  left_max = height[left];
				  }
				  else {
					  ans+=left_max-height[left];
				  }
				  left++;
			  }else {
				  if(height[right]>right_max) {
					  right_max = height[right];
				  }else {
					  ans+=right_max-height[right];
				  }
				  right--;
			  }
		  }
		  return ans;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[] = {2,0,2,3,4,2,4,5,2,4,2,5,2,1,3,4,6,43,23,1};
         System.out.println(trap3(a));
	}

}

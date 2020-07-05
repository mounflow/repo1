package code;

public class PackageByAutoRegulation {

	static int [] w = { 0,2 , 3 , 4 , 5 };
	static int [] v = { 0,3 , 4 , 5 , 6 };
	static int [] item ={1,1,1,1,1};
	static int Max_bag = 8;
	static int [][]dp = new int[v.length][Max_bag+1];
	
	
	public static void findWhat(int i,int j) {
		if(i>=1) {
			if(dp[i][j] == dp[i-1][j]) {
				item[i] = 0; findWhat(i-1,j);
			}else{
				item[i] =1;
				findWhat(i-1,j-w[i]);
			}
		}
	}

	public static void main(String srgs[]) {
		
		for(int i = 1; i< v.length; i++)
			for(int j = 1; j<=Max_bag;j++) {
				if(j<w[i])
					dp[i][j]=dp[i][j];
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
			}
		for(int i = 1; i<v.length;i++) {
			for(int j =1; j<=Max_bag;j++) 
				System.out.print(dp[i][j]+" ");		
		System.out.println();	
		}
		findWhat(v.length-1,Max_bag);
		for(int i:item)
			System.out.print(i+" ");
	}


}

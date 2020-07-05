package code;

public class RE{

    public static boolean isMatch(String s, String p){

        if(s==null||p==null)
            return false;
        int row = s.length();
        int cul = p.length();
        boolean [][]dp = new boolean[row+1][cul+1];
        dp[0][0] = true;

        for(int i = 1;i<=cul;i++){
            if(p.charAt(i-1)=='*'&&dp[0][i-2])
                dp[0][i] = true;
        }
        for(int i =1;i<=row;i++)
            for(int j = 1;j<=cul;j++)
            {
                    char c1 = s.charAt(i-1);
                    char c2 = p.charAt(j-1);
                if(c1==c2)
                    dp[i][j] = dp[i-1][j-1];
                else{
                    if(c2=='.')
                        dp[i][j] = dp[i-1][j-1];
                    else if(c2 == '*'){
                        if(c1 == p.charAt(j-2)||p.charAt(j-2)=='.')
                            dp[i][j] = dp[i][j-1] || dp[i-1][j];
                        dp[i][j] = dp[i][j]||dp[i][j-2];
                    }
                    else
                    dp[i][j] = false;
                }
            }
            return dp[row][cul];
    }
    public static void main(String args[]){
        
        System.out.println(isMatch("123", ".*123.*"));
    }
}
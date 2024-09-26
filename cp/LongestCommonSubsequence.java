import java.util.*;
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String dp[][]=new String[5][4];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],"1");
        }
        System.out.println(cal("abcde","bcea",0,0,dp));
    }
    public static String cal(String s1,String s2,int i,int j,String dp[][]){
        if(i>=s1.length() || j>=s2.length()){
            return "";
        }
        if(dp[i][j]!="1"){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
           return dp[i][j]=s1.charAt(i)+cal(s1,s2,i+1,j+1,dp);
        }
        String a = cal(s1,s2,i+1,j,dp);
        String b = cal(s1,s2,i,j+1,dp);
        if(a.length()>b.length()){
            return dp[i][j]=a;
        }else{
            return dp[i][j]=b;
        }
    }
}

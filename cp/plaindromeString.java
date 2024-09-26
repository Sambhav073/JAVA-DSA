import java.util.*;
public class plaindromeString {
    static List<List<String>> ans=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(partition("aaca"));
    }
        
        public static List<List<String>> partition(String s) {
            List<String> l=new ArrayList<>();
            solve(0,l,s);
            return ans;
        }
        public static void solve(int n,List<String> l,String s){
            if(l.size()==s.length()){
                List<String> nl=new ArrayList<>(l);
                ans.add(nl);
                return ;
            }
            String str="";
            for(int i=n;i<s.length();i++){
                str+=s.charAt(i);
                if(checkPalindrome(str)){
                    l.add(str);
                    solve(n+1,l,s);
                    l.remove(l.size()-1);
                }
            }
        }
        public static boolean checkPalindrome(String s){
            int i=0;int j=s.length()-1;
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;j--;
            }
            return true;
        }
    }


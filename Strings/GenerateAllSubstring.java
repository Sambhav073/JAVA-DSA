import java.util.*;
public class GenerateAllSubstring {
    static List<String> l=new ArrayList<>();
    public static void main(String[] args) {
        String str = "abcd";
        generateAllSubstrings(str,0,"");
        System.out.println(l);
    }
    public static void generateAllSubstrings(String s,int i,String ans){
        if(i>=s.length()){
            l.add(ans);
            return;
        }
        generateAllSubstrings(s, i+1, ans+s.charAt(i));
        generateAllSubstrings(s, i+1, ans);
    }

}

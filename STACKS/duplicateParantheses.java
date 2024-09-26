import java.util.*;
public class duplicateParantheses {
    public static boolean duplicateExists(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int c=0;
                while(s.peek()!='('){
                    s.pop();
                    c++;
                }
                if(c==0){
                    return true;
                }else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(((a+b)+(c+d)))";//true
        String str2="((a+b)+(c+d))";//false
        System.out.println(duplicateExists(str2));
    }
}

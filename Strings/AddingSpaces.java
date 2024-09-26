import java.util.*;
public class AddingSpaces {
    
        public String addSpaces1(String s, int[] spaces) { //passes 59/66 cases in leetcode TLE
            String ans="";int j=1;
            for(int i=0;i<spaces.length;i++){
               s=s.substring(0,spaces[i])+" "+s.substring(spaces[i],s.length());
               if(i<spaces.length-1){
                   spaces[i+1]=spaces[i+1]+j;
                   j++;}
            }
            return s;
        }
         public String addSpaces2(String s, int[] spaces) {  //passes 63/66 in leetcode TLE
    ArrayList<String> list=new ArrayList<>();String ans="";int j=0;
    
    for(int i=0;i<spaces.length;i++){
        if(j==spaces[i] && spaces[i]!=0){
            list.add(s.substring(j,s.length()-1));
        }
        
        list.add(s.substring(j,spaces[i]));
        j=spaces[i];
    }
    list.add(s.substring(spaces[spaces.length-1],s.length()));
    for(int i=0;i<list.size();i++){
        if(i==list.size()-1){
            ans+=list.get(i);
        }else{
        ans+=list.get(i)+" ";
    }}
    return ans;
}
    }


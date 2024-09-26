public class anagram {
    public static void main(String[] args) {
        String s1="aabcc";
        String s2="aabbcc";
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                System.out.println("not an anagram");
            }
        }
        
          //  System.out.println("anagram");
        
    }
}

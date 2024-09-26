public class pangram {
    public static void main(String[] args) {
        String s="AaxyDzlbmCnortuv";
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                arr[s.charAt(i)-65]++;
            }
            else{
                arr[s.charAt(i)-97]++;
            } 
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                System.out.print((char)(i+97));
            }
        }
    }
}

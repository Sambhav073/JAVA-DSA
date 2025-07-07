public class ReverseString {
    public String reverse(String s){
        char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char bk=arr[i];
            arr[i]=arr[j];
            arr[j]=bk;
            i++;
            j--;
        }
        return new String(arr);
    }
}

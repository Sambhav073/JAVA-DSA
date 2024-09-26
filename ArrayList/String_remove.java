import java.util.*;
public class String_remove {
    public static int check(String str) {
        int x = 0;
        int y = 1;
        ArrayList<String> l1 = new ArrayList<>();
        while (y < str.length()) {
            StringBuilder s = new StringBuilder("");
            for (int j = 0; j < str.length(); j++) {
                if (j == x || j == y)
                    continue;
                else {
                    s.append(str.charAt(j));
                }
            }
            x++;
            y++;
            if (l1.contains(s.toString()))
                continue;
            else {
                l1.add(s.toString());
            }
        }
        return l1.size();
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0;i<num;i++) {
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        arr.add(check(str));
    }
    for(int i=0;i<arr.size();i++) {
        System.out.println(arr.get(i));
       }
    }
}
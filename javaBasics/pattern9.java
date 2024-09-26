public class pattern9 {
    public static void main(String args[]) {

       
                // for(int i=1;i<=5;i++){
                //     for(int j=5;j>=i;j--){
                //         System.out.print(" * ");
                //     }
                //     for(int j=1;j<i;j++){
                //         System.out.print("      ");
                //     }
                //     for(int j=5;j>=i;j--){
                //         System.out.print(" * ");
                //     }
                //     System.out.println();
                // }
                // for(int i=5;i>=1;i--){
                //     for(int j=5;j>=i;j--){
                //         System.out.print(" * ");
                //     }
                //     for(int j=1;j<i;j++){
                //         System.out.print("      ");
                //     }
                //     for(int j=5;j>=i;j--){
                //         System.out.print(" * ");
                //     }
                //     System.out.println();
                // }
                    int n=8;
                for(int i=0;i<=n;i++){
                    for(int j=0;j<=i;j++){
                        if(j==i || i+j==i || i==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                    System.out.println();
                }
            }
        }
    
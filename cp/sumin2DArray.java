public class sumin2DArray {
    public static void main(String[] args) {
        int arr[][]={
        {2,3,-1},
        {4,5,2},
        {8,-2,9}};
        int arr2[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i-1<0 && j-1<0){
                    arr2[i][j]=arr[i][j];
                }else if(i-1<0){
                    arr2[i][j]=arr2[i][j-1]+arr[i][j];
                }
                else if(j-1<0){
                    arr2[i][j]=arr2[i-1][j]+arr[i][j];
                }else{
                    arr2[i][j]=arr[i][j]+arr2[i-1][j]+arr2[i][j-1]-arr2[i-1][j-1];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}

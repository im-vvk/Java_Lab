import java.util.*;

public class upperTri {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Input the row of matrix: ");
        int n = ip.nextInt();
        int[][] arr = new int[n][];

        for(int i=0;i<n;i++){
            arr[i] = new int[n-i];
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                arr[i][j] = ip.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;


public class matrixT {
    public static void main(String[] args)  {
       Scanner ip = new Scanner(System.in);
       System.out.print("Input the size of matrix: ");
        int n = ip.nextInt();
        int arr[][] = new int[n][n];

        System.out.print("Input the matrix:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = ip.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}

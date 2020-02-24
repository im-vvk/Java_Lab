import java.util.*;

public class matrixMult {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Input the size of matrix: ");
        int n = ip.nextInt();
        int arr1[][] = new int[n][n];
        int arr2[][] = new int[n][n];
        int arr[][] = new int[n][n];

        System.out.print("Input the matrix1:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = ip.nextInt();
            }
        }
        System.out.print("Input the matrix2:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = ip.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key = 0;
                for(int k=0;k<n;k++){
                    key = key + arr1[i][k]*arr2[k][j];
                }
                arr[i][j] = key;
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

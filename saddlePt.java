import java.util.*;

public class saddlePt {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Input the row of matrix: ");
        int n = ip.nextInt();
        int arr[][] = new int[n][n];

        System.out.print("Input the matrix:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = ip.nextInt();
            }
        }

        int min[] = new int[n];
        int max[] = new int[n];
        for(int i=0;i<n;i++){
            min[i] = 1000000;
            for(int j=0;j<n;j++){
                if(arr[i][j]<min[i]){
                    min[i] = arr[i][j];
                }
            }
        }

        for(int j=0;j<n;j++){
            max[j] = -1;
            for(int i=0;i<n;i++){
                if(arr[i][j]>max[j]){
                    max[j] = arr[i][j];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((arr[i][j] == min[i]) && (arr[i][j] == max[j])){
                    System.out.print(arr[i][j]+" "+i+" "+j);
                }
            }
        }
    }
}

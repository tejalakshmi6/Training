import java.util.*;

public class pattern3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for( i=0; i<n; i++){
            for( k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for( j=1; j<=(2*i +1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

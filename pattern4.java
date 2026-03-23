import java.util.*;

public class pattern4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for( i=0; i<n; i++){
            for( k=0;k<i;k++){
                System.out.print(" ");
            }
            for( j=1; j<=2*(n-i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

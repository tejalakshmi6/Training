public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        Rotate(matrix);
        System.out.println("------");
        //Rotate2(matrix);
        System.out.println("------");
        optimalRotate(matrix);
    }

    
    static void Rotate(int[][] mat) {
        // brute force
        int row = mat.length;
        int col = mat[0].length;
        int[][] res = new int[row][col];
        int k = 0;
        for(int r = 0; r < row; r++) {
            int j = col - 1;
            for(int c = 0; c < col; c++) {
                res[r][c] = mat[j][k];
                j--;
            }
            k++;
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Rotate2(int[][] mat) {
        int n = mat[0].length;
        int[][] res = new int[n][n];
        for(int i=0; i<n ;i++) {
            for(int j=0; j<n; j++) {
                res[j][n-1-i] = mat[i][j]; 
            }
        }
        for(int i=0; i<n ;i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = res[i][j]; 
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void optimalRotate(int[][] mat) {
        // transpose
        int n = mat.length;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // reverse each row
        for(int i=0; i<n ;i++) {
            int l = 0, r = n-1;
            while( l < r ) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

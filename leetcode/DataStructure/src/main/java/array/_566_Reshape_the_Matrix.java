package array;

public class _566_Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] outputMat = new int[r][c];
        int numbRows = mat.length;
        int numbCols = mat[0].length;
        if (numbCols*numbCols == c*r){
            if (numbRows == c && numbCols == r){
                for(int i=0; i < c; i++){
                    for (int j = 0; j < r; j++){
                        outputMat[i][j] = mat[j][i];
                    }
                }
            } else if (numbRows == 1){
                int c = 0;
                for(int i=0; i < c; i++){
                    for (int j = 0; j < r; j++){
                        outputMat[numbRows][c] = mat[j][i];
                        c++;
                    }
                }
            } else{
                return mat;
            }
        }else{
            return mat;
        }


    }

    public static void main(String[] args){
        int[][] nums1 = {{1, 2}, {3, 4}};
        int[][] result = matrixReshape(nums1, 1, 4);
        System.out.println(result);
    }
}

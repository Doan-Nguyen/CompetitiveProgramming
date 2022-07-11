package array;

public class _566_Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] outputMat = new int[r][c];
        int numbRows = mat.length;
        int numbCols = mat[0].length;
        if (numbCols*numbCols == c*r) {
            if (numbRows == c && numbCols == r) {
                outputMat = new int[r][c];
                for (int i = 0; i < numbCols; i++) {
                    for (int j = 0; j < numbRows; j++) {
                        outputMat[i][j] = mat[j][i];
                    }
                }
                return outputMat;
            } else if (r == 1) {
                int count = 0;
                outputMat = new int[r][numbRows*numbCols];
                for (int i = 0; i < numbRows; i++) {
                    for (int j = 0; j < numbCols; j++) {
                        outputMat[0][count] = mat[i][j];
                        count++;
                    }
                }
                return outputMat;
            } else if (c == 1){
                int count = 0;
                outputMat = new int[numbRows*numbCols][c];
                for (int i = 0; i < numbRows; i++) {
                    for (int j = 0; j < numbCols; j++) {
                        outputMat[count][0] = mat[i][j];
                        count++;
                    }
                }
                return outputMat;
            }
            else {
                return mat;
            }
        }
        return mat;
    }

    public static void main(String[] args){
        int[][] nums1 = {{1, 2}, {3, 4}};
        int[][] result = matrixReshape(nums1, 2, 4);
        System.out.println(result.toString());
    }
}

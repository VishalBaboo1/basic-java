package array;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][]={{5,6,5},{4,3,2}};
        int matrix1[][]={{1,2,5},{6,8,9}};
        int matrix2[][]={{0,0,0},{0,0,0}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix2[i][j]=matrix[i][j]+matrix1[i][j];
                System.out.print(matrix2[i][j]+"  ");}
            System.out.println(":");


            }
        }
    }


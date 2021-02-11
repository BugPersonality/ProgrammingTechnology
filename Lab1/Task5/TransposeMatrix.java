class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int swapNum;
        
        System.out.println("First matrix: ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j]=(int)Math.round(Math.random()*10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Second matrix: ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 1) || (i == 0 && j == 2) || (i == 1 && j == 2)){
                    swapNum = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = swapNum;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

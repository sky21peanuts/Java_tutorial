class MultiArrayMethodSample{
    static void addMatrix(int[][] x, int[][] y, int[][] z){
        for(int i = 0; i < x.length; i++)
            for(int j = 0; j < x[i].length; j++)
                z[i][j] = x[i][j] + y[i][j];
    }

    static int[][] multiplyMatrixByScalar(int[][] x, int k){
        int[][] y = new int[x.length][];
        for(int i = 0; i < x.length; i++){
            y[i] = new int[x[i].length];
            for(int j = 0; j < x[i].length; j++)
                y[i][j] = k * x[i][j];
        }
        return y;
    }

    static void printMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++)
                System.out.printf(" %2d", m[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] a = {{1, 0, 1}, {0, -4, 2}};
        int[][] b = {{5, -3, 0}, {0, 2, -1}};
        int[][] c = new int[2][3];
        int[][] d = {{1, -2, 0}, {0, -1, 3}};

        addMatrix(a, b, c);

        System.out.println("Matrix \'a\'");
        printMatrix(a);
        System.out.println();
        System.out.println("Matrix \'b\'");
        printMatrix(b);
        System.out.println();
        System.out.println("Matrix \'c\'");
        printMatrix(c);
        System.out.println();

        int[][] e = multiplyMatrixByScalar(d, 2);

        System.out.println("Matrix \'d\'");
        printMatrix(d);
        System.out.println();
        System.out.println("Matrix \'e\'");
        printMatrix(e);
    }
}

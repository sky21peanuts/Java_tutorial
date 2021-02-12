class MultidimensionalSample{
    public static void main(String[] args){
        int[][] a = new int[2][5];

        a[0][0] = 64;
        a[0][1] = 75;
        a[0][2] = 40;
        a[0][3] = 92;
        a[0][4] = 58;
        a[1][0] = 71;
        a[1][1] = 62;
        a[1][2] = 54;
        a[1][3] = 90;
        a[1][4] = 84;

        for(int i = 0; i < 5; i++){
            System.out.println("English\'s score for number " + (i + 1) + " is " + a[0][i]);
            System.out.println("   Math\'s score for number " + (i + 1) + " is " + a[1][i]);
        }
        System.out.println();

        int[][] b = {
            {64, 75, 40, 92, 58},
            {71, 62, 54, 90, 84}
        };

        for(int i = 0; i < 5; i++){
            System.out.println("English\'s score for number " + (i + 1) + " is " + b[0][i]);
            System.out.println("   Math\'s score for number " + (i + 1) + " is " + b[1][i]);
        }
        System.out.println();

        int[][] c;
        c = new int[4][];
        c[0] = new int[2];
        c[1] = new int[4];
        c[2] = new int[3];
        c[3] = new int[5];

        System.out.println("The length for array \'c\' is " + c.length);
        for(int i = 0; i < c.length; i++){
            System.out.println("The length for array c[" + i + "] is " + c[i].length);
            for(int j = 0; j < c[i].length; j++){
                System.out.printf(" %2d", c[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] d = {
            {0, 1},
            {10, 11, 12, 13},
            {20, 21, 22},
            {30, 31, 32, 33, 34}
        };

        System.out.println("The length for array \'d\' is " + d.length);
        for(int i = 0; i < d.length; i++){
            System.out.println("The length for array d[" + i + "] is " + d[i].length);
            for(int j = 0; j < d[i].length; j++){
                System.out.printf(" %2d", d[i][j]);
            }
            System.out.println();
        }
    }
}

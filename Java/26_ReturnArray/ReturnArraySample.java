class ReturnArraySample{
    static int[] arrayClone(int[] x){
        int[] c = new int[x.length];
        for(int i = 0; i < c.length; i++)
            c[i] = x[i];
        return c;
    }

    static void printArray(int[] x){
        for(int n: x)
            System.out.printf(" %2d", n);
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};

        System.out.println("The array body that \'a\' means is ");
        printArray(a);
        System.out.println("The array body that \'b\' means is ");
        printArray(b);

        b = arrayClone(a);
        System.out.println("Array \'a\' is copied to array \'b\'");
        b[0] = 10;
        System.out.println("10 is imported to b[0]");

        System.out.println("The array body that \'a\' means is ");
        printArray(a);
        System.out.println("The array body that \'b\' means is ");
        printArray(b);
    }
}

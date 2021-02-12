class ArrayImport{
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};

        System.out.println("The body \'a\' means is");
        for(int i = 0; i < a.length; i++)
            System.out.printf(" %2d", a[i]);
        System.out.println();
        System.out.println("The body \'b\' means is");
        for(int i = 0; i < b.length; i++)
            System.out.printf(" %2d", b[i]);
        System.out.println();

        b = a;
        b[0] = 10;

        System.out.println("After this operation, array has changed to following");

        System.out.println("The body \'a\' means is");
        for(int i = 0; i < a.length; i++)
            System.out.printf(" %2d", a[i]);
        System.out.println();
        System.out.println("The body \'b\' means is");
        for(int i = 0; i < b.length; i++)
            System.out.printf(" %2d", b[i]);
        System.out.println();

        System.out.println();
        System.out.println();


        int[] c = {1, 2, 3, 4, 5};
        int[] d = {6, 7, 8, 9};
        
        System.out.println("The body \'c\' means is");
        for(int i = 0; i < c.length; i++)
            System.out.printf(" %2d", c[i]);
        System.out.println();
        System.out.println("The body \'d\' means is");
        for(int i = 0; i < d.length; i++)
            System.out.printf(" %2d", d[i]);
        System.out.println();

        d = new int[c.length];
        for(int i = 0; i < c.length; i++)
            d[i] = c[i];
        d[0] = 10;

        System.out.println("After this operation, array has cha ged to following");
        
        System.out.println("The body \'c\' means is");
        for(int i = 0; i < c.length; i++)
            System.out.printf(" %2d", c[i]);
        System.out.println();
        for(int i = 0; i < d.length; i++)
            System.out.printf(" %2d", d[i]);
        System.out.println();
    }
}

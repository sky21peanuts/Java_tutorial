class NullSample{
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("a = " + a);
        System.out.print("a = ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        a = null;

        System.out.println("After this operation, array \'a\' has changed to following");
        System.out.println("a = " + a);
        System.out.println("a = ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

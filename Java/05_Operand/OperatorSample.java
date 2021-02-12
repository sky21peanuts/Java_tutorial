class OperatorSample{
    public static void main(String[] args){
        int a1, a2, a3, a4, a5, a6, a7, a8;

        a1 = 1;
        a2 = 1;
        a3 = a1 + a2;
        a4 = a2 + a3;
        a5 = 9;
        a6 = a5++;
        a7 = 9;
        a8 = ++a7;

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);
        System.out.println("a5 = " + a5);
        System.out.println("a6 = " + a6);
        System.out.println("a7 = " + a7);
        System.out.println("a8 = " + a8);
    }
}

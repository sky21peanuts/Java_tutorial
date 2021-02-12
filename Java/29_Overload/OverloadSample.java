class OverloadSample{
    static int max(int a, int b){
        return a > b ? a : b;
    }

    static int max(int a, int b, int c){
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        return max;
    }

    static int sumUp(int m, int n){
        int sum = 0;
        for(int i = m; i <= n; i++)
            sum += i;
        return sum;
    }

    static int sumUp(int n){
        return sumUp(1, n);
    }
    
    public static void main(String[] args){
        System.out.println("Maximum value 1 and -2 is " + max(1, -2));
        System.out.println("Maximum value 1, -2 and 5 is " + max(1, -2, 5));
        System.out.println("The sum from 1 to 10 is " + sumUp(10));
        System.out.println("The sum from -2 to 4 is " + sumUp(-2, 4));
        System.out.println("The sum from -5 to 2 is " + sumUp(-5, 2));
    }
}

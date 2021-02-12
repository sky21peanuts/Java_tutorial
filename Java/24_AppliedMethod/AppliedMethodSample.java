import java.io.*;

class AppliedMethodSample{
    static int get_factorial(int n){
        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    static int permutation(int n, int r){
        int p = get_factorial(n) / get_factorial(n - r);
        return p;
    }

    static int combination(int n, int r){
        int c = permutation(n, r) / get_factorial(r);
        return c;
    }

    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, r;

        do{
            System.out.print("Input a Integer n from 0 to 12 -> ");
            n = Integer.parseInt(br.readLine());
        } while(n < 0 || n > 12);
        do{
            System.out.print("Input a Integer n from 0 to " + n + " -> ");
            r = Integer.parseInt(br.readLine());
        } while(r < 0 || r > n);
        System.out.println(n + "P" + r + " = " + permutation(n, r));
        System.out.println(n + "C" + r + " = " + combination(n, r));
    }
}

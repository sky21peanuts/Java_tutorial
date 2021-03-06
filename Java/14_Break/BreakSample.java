import java.io.*;

class BreakSample{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a plus integer");
        int num = Integer.parseInt(br.readLine());
        boolean prime = true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }

        if(num == 1)
            prime = false;

        if(prime)
            System.out.println("It\'s a prime");
        else
            System.out.println("It\'s not a prime");
    }
}

import java.io.*;

class DoSample{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What number do you want to get the sum from 1 to ");
        int num;
        do{
            System.out.println("Input a plus integer");
            num = Integer.parseInt(br.readLine());
        } while(num <= 0);

        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("The sum from 1 to " + num + " is " + sum);
    }
}

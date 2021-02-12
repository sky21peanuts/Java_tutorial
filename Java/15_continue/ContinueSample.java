import java.io.*;

class ContinueSample{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What number do you want to get the sum (odd only) from 1 to ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println("The sum from 1 to " + num + " (odd only) is " + sum);
    }
}

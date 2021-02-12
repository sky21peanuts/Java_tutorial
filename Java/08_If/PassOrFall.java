import java.io.*;

class PassOrFall{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a score");
        int point = Integer.parseInt(br.readLine());

        if(point >= 80 && point <= 100){
            if(point == 100){
                System.out.println("Passed with full point");
            }
            else{
                System.out.println("Passed");
            }
            System.out.println("Congratulations");
        }
        else if(point >= 60 && point < 80){
            System.out.println("Falled, Rank A");
            System.out.println("More a little bit for pass");
        }
        else if(point >= 0 && point < 60){
            System.out.println("Falled, Rank B");
            System.out.println("Change the way to study");
        }
        else{
            System.out.println("Width is 0 to 100");
        }

        System.out.println("That\'s all");

        System.out.println("Input the first Integer");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Input the second Integer");
        int num2 = Integer.parseInt(br.readLine());

        int max = num1 > num2 ? num1 : num2;

        System.out.println(max + " is the bigger");
    }
}

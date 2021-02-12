import java.io.*;
import java.util.Random;

class ScopeSample{
    static int HiScore;

    static void updateHiScore(int score){
        if(score > HiScore){
            System.out.println("Hi Score!");
            HiScore = score;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rnd = new Random();

        while(true){
            int cont;
            do{
                System.out.println("Play fishing ? [Yes...1 /No...0]");
                cont = Integer.parseInt(br.readLine());
            } while(cont != 1 && cont != 0);
            if(cont == 0)
                break;
            int score = rnd.nextInt(1000);
            System.out.println("You got " + score + " gram\'s fish");
            updateHiScore(score);
            System.out.println("Current hiscore is " + HiScore);
            System.out.println();
        }
    }
}

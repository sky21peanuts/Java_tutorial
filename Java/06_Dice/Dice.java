import java.util.Random;

class Dice{
    public static void main(String[] args){
        Random rnd = new Random();

        System.out.println("Roll Dice");
        int num = rnd.nextInt(6);
        num++;
        System.out.println(num + "is out");
    }
}

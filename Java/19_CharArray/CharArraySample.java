import java.util.Random;

class CharArraySample{
    public static void main(String[] args){
        Random rnd = new Random();
        String[] fortune = {"A", "B", "C", "D", "E", "F", "G"};

        int index = rnd.nextInt(fortune.length);
        System.out.println(fortune[index]);
    }
}

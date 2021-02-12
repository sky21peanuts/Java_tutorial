import java.io.*;

class IOSample{
    public static void main(String[] args) throws IOException{
        String name;
        int price;
        double rate;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a product name");
        name = br.readLine();

        System.out.println("Input the price");
        price = Integer.parseInt(br.readLine());

        System.out.println("Input the rate");
        rate = Double.parseDouble(br.readLine());

        System.out.println("Product name: " + name);
        System.out.println("price: "+ price + " yen");
        System.out.println("rate: " + rate + " star");
    }
}

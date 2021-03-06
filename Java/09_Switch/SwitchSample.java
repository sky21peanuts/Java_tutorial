import java.io.*;

class SwitchSample{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Which OS is used ? Input a number");
        System.out.println("W...Windows / M...MacOS X / L...Linux / X...Others");
        int initial = br.readLine().charAt(0);

        switch(initial){
        case 'w':
        case 'W':
            System.out.println("Hello, Windows User");
            break;
        case 'm':
        case 'M':
            System.out.println("Hello, MacOS X User");
            break;
        case 'l':
        case 'L':
            System.out.println("Hello, Linux User");
            break;
        case 'x':
        case 'X':
            System.out.println("Hello, ?OS User");
            break;
        default:
            System.out.println("Input the initial word W, M, L or X");
            break;
        }
    }
}

class CommandLineSample_1{
    public static void main(String[] args){
        if(args.length == 0)
            System.out.println("No CommandLine argument");
        else
            for(int i = 0; i < args.length; i++)
                System.out.println((i + 1) + " : " + args[i]);
    }
}

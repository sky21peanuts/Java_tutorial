class EnhancedArraySample{
    public static void main(String[] args){
        double[] radii = {1.0, 2.0, 3.0, 4.0};
        double pi = 3.14;

        for(double radius: radii){
            System.out.println("Circumference that\'s radius is " + radius + " is " + 2 * pi * radius);
        }
        System.out.println();

        String[] versions = {"95", "98", "2000", "Me", "XP", "Vista", "7", "8", "10"};

        for(String ver: versions){
            System.out.println("Windows " + ver);
        }
    }
}

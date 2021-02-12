class Robot{
    String name;
    int battery;
}

class ClassSample{
    public static void main(String[] args){
        Robot robot1 = new Robot();
        robot1.name = "My Robot";
        robot1.battery = 100;

        Robot robot2 = new Robot();
        robot2.name = "New Robot";
        robot2.battery = 90;

        System.out.println("   Name : " + robot1.name);
        System.out.println("Battery : " + robot1.battery);
        System.out.println();
        System.out.println("   Name : " + robot2.name);
        System.out.println("Battery : " + robot2.battery);
    }
}

class Robot{
    private String name;
    private int battery;
    private int x;

    Robot(){};

    Robot(String n){
        name = n;
        battery = 0;
        x = 0;
    }

    Robot(String n, int btry){
        name = n;
        setBattery(btry);
        x = 0;
    }

    int getBattery(){
        return battery;
    }

    void setName(String n){
        name = n;
    }

    void setBattery(int btry){
        if(btry >= 0)
            battery = btry;
        else
            battery = 0;
    }

    boolean walkX(int dx){
        int d = dx >= 0 ? dx : -dx;
        if(d <= battery){
            x += dx;
            battery -= d;
            return true;
        }
        else
            return false;
    }

    void showStatus(){
        System.out.println("Current point \'x\' : " + x);
        System.out.println("          Battery : " + battery);
    }

    void show(){
        System.out.println("             Name : " + name);
        showStatus();
    }
}

class EncapsulationSample{
    public static void main(String[] args){
        Robot robot1 = new Robot();
        // robot1.name = "My robot";
        // robot1.battery = 100;
        robot1.setName("My robot");
        robot1.setBattery(100);

        Robot robot2 = new Robot("New robot");
        robot2.setBattery(-90);
        if(robot2.getBattery() == 0)
            robot2.setBattery(90);

        robot1.show();
        System.out.println();
        robot2.show();
    }
}

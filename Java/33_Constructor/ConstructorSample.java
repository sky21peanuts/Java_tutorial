class Robot{
    String name;
    int battery;
    int x;

    Robot(){};

    Robot(String n){
        name = n;
        battery = 0;
        x = 0;
    }

    Robot(String n, int btry){
        name = n;
        battery = btry;
        x = 0;
    }

    boolean walkX(int dx){
        int d = dx > 0 ? dx : -dx;
        if(d <= battery){
            x += dx;
            battery -= d;
            return true;
        }
        else
            return false;
    }

    void showStatus(){
        System.out.println("current point \'x\' : " + x);
        System.out.println("Battery : " + battery); 
    }

    void show(){
        System.out.println("   Name : " + name);
        showStatus();
    }
}

class ConstructorSample{
    public static void main(String[] args){
        Robot robot1 = new Robot("My robot", 100);
        Robot robot2 = new Robot("New robot");
        Robot robot3 = new Robot();

        robot1.show();
        System.out.println();
        robot2.show();
        System.out.println();
        robot3.show();
    }
}

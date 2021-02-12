class Robot{
    String name;
    int battery;
    int x;

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
        System.out.println("Current Point \'x\' : " + x);
        System.out.println("Battery : " + battery);
    }

    void show(){
        System.out.println("   Name : " + name);
        showStatus();
    }
}

class InstanceMethodSample{
    public static void main(String[] args){
        Robot robot1 = new Robot();
        robot1.name = "My Robot";
        robot1.battery = 100;

        robot1.show();
        System.out.println();
        System.out.println(robot1.name + " is to walk");
        System.out.println();
        int[] dxes = {40, -25, 50, 16};
        for(int dx: dxes){
            if(! robot1.walkX(dx))
                System.out.println(robot1.name + " is no longer to walk because of battery shortage");
            robot1.showStatus();
        }
    }
}

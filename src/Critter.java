public class Critter {
    private boolean isAlive;
    private int foodLevel;
    private int tiredness;
    private int fitness;
    public String name;
    public boolean iswin;


    public Critter() {
        isAlive = true;
        foodLevel = 5;
        tiredness = 0;
        fitness = 0;
        iswin=true;

    }


    public boolean isAlive() {
        return isAlive;
    }

    private void die() {
        isAlive = false;
    }


    private void win() {
        iswin = false;
    }
/// sleep system held together by duct tape
    static void ZZZ() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("Zzz");
    }
    public void sleep() {
        System.out.println(name +" sleeps.");
        tiredness = 0;
        foodLevel -= 2;
        ZZZ();
        ZZZ();
        ZZZ();
        ZZZ();
        ZZZ();
        System.out.println(foodLevel);
        System.out.println(tiredness);
        if (foodLevel <= 0) {
            System.out.println( name + " starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive) {
            System.out.println( name +" eats.");
            foodLevel++;
            tiredness++;
            System.out.println(foodLevel);
            System.out.println(tiredness);
            if (foodLevel > 10) {
                System.out.println("Critter over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(name +" is sleepy from so much food.");
                sleep();
            }
        }
    }
    public void train(){
        if (isAlive) {
            System.out.println("Critter trained.");
            foodLevel--;
            tiredness++;
            fitness+=2;
            System.out.println(foodLevel);
            System.out.println(tiredness);
            System.out.println(fitness);
            if (fitness > 5) {
                win();


            }
            else if (foodLevel < 0) {
                System.out.println( name + " got hungry.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(name + " is sleepy from so much exercise.");
                sleep();
            }
        }

    }

    public boolean iswin() {
        return iswin;
    }
}

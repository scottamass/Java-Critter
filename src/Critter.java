import javax.xml.namespace.QName;

public class Critter {
    private boolean isAlive;
    private int foodLevel;
    private int tiredness;
    private int fitness;
    public String name;


    public Critter() {
        isAlive = true;
        foodLevel = 5;
        tiredness = 0;
        fitness = 0;

    }

    public boolean isAlive() {
        return isAlive;
    }

    private void die() {
        isAlive = false;
    }
    
    public void sleep() {
        System.out.println("name sleeps.");
        tiredness = 0;
        foodLevel -= 3;
        System.out.println(foodLevel);
        System.out.println(tiredness);
        if (foodLevel <= 0) {
            System.out.println( name + " starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive) {
            System.out.println("Critter eats.");
            foodLevel++;
            tiredness++;
            System.out.println(foodLevel);
            System.out.println(tiredness);
            if (foodLevel > 10) {
                System.out.println("Critter over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println("Critter is sleepy from so much food.");
                sleep();
            }
        }
    }
    public void train(){
        if (isAlive) {
            System.out.println("Critter trained.");
            foodLevel--;
            tiredness++;
            fitness ++;
            System.out.println(foodLevel);
            System.out.println(tiredness);
            if (foodLevel < 0) {
                System.out.println("Critter got hungry.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println("Critter is sleepy from so much exercise.");
                sleep();
            }
        }

    }
}

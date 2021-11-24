public class Critter {
    private boolean isAlive ,Win;
    private int foodLevel;
    private int tiredness;
    private int fitness;
    public String name;





    public Critter() {
        isAlive = true;
        foodLevel = 5;
        tiredness = 0;
        fitness = 0;
        Win=false;
       // this.name =name;


    }



    public boolean isAlive() {
        return isAlive;
    }
    public boolean win() {
        return Win;
    }



    private void die() {
        isAlive = false;
    }


    private void Win() {
        Win = true;
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
      //  System.out.println(foodLevel);
      //  System.out.println(tiredness);
        if (foodLevel <= 0) {
            System.out.println( name + " starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive && !Win) {
            System.out.println( name +" eats.");

            foodLevel++;
            tiredness++;
           // System.out.println(foodLevel);
           // System.out.println(tiredness);
            if (foodLevel > 10) {
                System.out.println(name +" over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(name +" is sleepy from so much food.");
                sleep();
            }
        }
    }

    public void animal_Sound() {
        System.out.println("ok lets do this ....LEEEEROOOOYYYY JENNNNKKINS");
    }


    public void train(){
        if (isAlive && !Win) {
            System.out.println("Critter trained.");
            foodLevel--;
            tiredness++;
            fitness+=6;
            //System.out.println(foodLevel);
            //System.out.println(tiredness);
            //System.out.println(fitness);
            if (fitness >= 5) {
                Win();
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


}

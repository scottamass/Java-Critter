import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner animal = new Scanner(System.in);
        Critter critter;
        System.out.println("what animal are you 1=dog/ 2=cat");
        int choice = animal.nextInt();

        if (choice==1){
            critter = new Dog();
        } else if (choice == 2) {
            critter = new Cat();
        }
        else
            critter = new Critter();



        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        critter.name = scanner.nextLine();
        //while (bob.iswin()) {
            while (critter.isAlive() && !critter.win()) {

                System.out.println("What would you like Critter to do?");
                String lineRead = scanner.nextLine();
                if (lineRead.equalsIgnoreCase("eat")) {
                    critter.animal_Sound();
                    critter.feed();
                } else if (lineRead.equalsIgnoreCase("sleep")) {
                    critter.sleep();
                } else if (lineRead.equalsIgnoreCase("train")) {
                    critter.train();
                }
            }
           if(!critter.isAlive()){ System.out.println(critter.name + "has died.");
            System.out.println("you lost the game.");
           }

           if(critter.win()) System.out.println("you win");
            scanner.close();
        }
    //    System.out.println("you win");

     //   scanner.close();
  //  }
    }


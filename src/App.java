import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Critter bob = new Critter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        bob.name = scanner.nextLine();
        //while (bob.iswin()) {
            while (bob.isAlive() && !bob.win()) {

                System.out.println("What would you like Critter to do?");
                String lineRead = scanner.nextLine();
                if (lineRead.equalsIgnoreCase("eat")) {
                    bob.feed();
                } else if (lineRead.equalsIgnoreCase("sleep")) {
                    bob.sleep();
                } else if (lineRead.equalsIgnoreCase("train")) {
                    bob.train();
                }
            }
           if(!bob.isAlive()){ System.out.println(bob.name + "has died.");
            System.out.println("you lost the game.");
           }

           if(bob.win()) System.out.println("you win");
            scanner.close();
        }
    //    System.out.println("you win");

     //   scanner.close();
  //  }
    }


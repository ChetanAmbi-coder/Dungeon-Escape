package Src;
import java.util.Scanner;

public class Game{
    public void start(){
        System.out.println("Game started");
    }
    public static void main(String[] args) {
        
        System.out.println("Welcome, brave adventure!\n");

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello"  + " " +name + "\n");
        System.out.println("Your Adventure begins now...\n");
        System.out.println("====================");
        System.out.println("   DUNGEON ");
        System.out.println("====================");
        System.out.println("You are standing at the entrance of a mysterious dungeon.\n");
        System.out.println("What do you want to do?\n");
         System.out.println("1.Entered the dungeon");
          System.out.println("2.Exit the game");
          int choice = in.nextInt() ;
          int select = in.nextInt();

          
            switch (choice) {
                case 1:{

                
                     System.out.println(" You Entered the dungeon!\n");
                     System.out.println("---------ROOM 1--------ln\n");
                     System.out.println("What do tou whant do?");
                     System.out.println("1.Explore");
                     System.out.println("2.Check status");
                     System.out.println("3.exit");
                    
                     switch (select) {
                        case 1:
                            System.out.println("You explore the room...\n You found a mysterious path!");
                            
                            break;
                        case 2:
                            System.out.println("---------PLAYER STATUS!--------ln\n");
                            System.out.println("name:" +name);
                            System.out.println("Health: 100");
                     
                        default:
                            break;
                     }
                    

                    
                    break;
                }
                case 2:
                     System.out.println("You choose to leave the dungeon");
                      System.out.println("Bye! Bye!" +name);
                      break;


            
                default:
                     System.out.println("invalid choice please choose 1 or 2");

                    break;
            }
            in.close();
            System.out.println("started");



          }

    }

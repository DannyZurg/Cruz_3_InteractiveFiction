package cruz_3_interactivefiction;

import java.util.Scanner;
import java.util.Random;

public class Cruz_3_InteractiveFiction {

    static int rightnumber;
    static String userpick;
    static String username;
    static Random randy = new Random();
    static boolean playagain;
    static int counter;
    static int health;
    static Scanner choose = new Scanner(System.in);
    static boolean archeristrue;
    static boolean warrioristrue = false;
    static boolean mageistrue;
    static boolean thiefistrue;
    static Scanner userinputname = new Scanner(System.in);
    static Scanner userchoice = new Scanner(System.in);
    static String fightingclass;
    public static void main(String[] args) {
        System.out.println("Welcome To Souls of Infinite");
        /*#Hero*/System.out.println("Enter the name you wish to be called.");
        
        username = userinputname.nextLine();
       /*#Forthewin*/ System.out.println("OK " + username + ", your objective is to steal all of the goblin's gold");
       /*#Fortheloss*/ System.out.println("If you die though, you lose and will have to start over. Ready? Let's go.");

        /*This method lets me choose the kind of fighter I am*/chooseclass();
       
    }

    /*#method1*/static void chooseclass() {
        System.out.println("Warrior, Mage, Archer, or Thief");
        fightingclass = userchoice.nextLine().toLowerCase();
        if (fightingclass.contains("warrior")) {
            
            warrior();

        } else if (fightingclass.contains("mage")) {
            
            mage();

        } else if (fightingclass.contains("archer")) {
            
            archer();

        }else if (fightingclass.contains("thief")) {
             
            thief();             

    }
    }
   /*#method2*/ static void warrior() {
      // while (!warrioristrue){
      // Scanner userchoice = new Scanner(System.in); 
      // userpick = userchoice.nextLine();
      //  if ("Warrior".equals(userpick)){ 
      //      warrioristrue = true;
        System.out.println("You have chosen the path of the sword.");
        direction();
        }
       
   
   
    /*#method3*/ static void mage(){
     //   Scanner userchoice = new Scanner(System.in);
       // userpick = userchoice.nextLine();
       // if ("Mage".equals(userpick)) {
            System.out.println("You have chosen the arcane arts.");
            direction();
       }
    

    /*#method4*/static void archer() {
      //  Scanner userchoice = new Scanner(System.in);
      //  userpick = userchoice.nextLine();
    //    if ("Archer".equals(userpick)) {
            System.out.println("You have chosen the way of the Bow and Arrow");
            direction();
        }
    

    /*#method5*/static void thief() {
     //   Scanner userchoice = new Scanner(System.in);
    //    userpick = userchoice.nextLine();
    //    if ("Thief".equals(userpick)) {
            System.out.println("You have chosen the path of thievery.");
            direction();
    }
    
   /*#method6*/ static void direction(){
        //In this method you're going to fight in the dungeon to steal the gold*/
       System.out.println("Time to enter the dungeon.");
       System.out.println("You have 100 HP. It is represented like this: [==========]. Each = is equal to 10 HP and each - is equal to 5 HP.");
       System.out.println("You come to the entrance. Go left or right?");
               Scanner userchoice = new Scanner(System.in);
               userpick = userchoice.nextLine().toLowerCase();
               if(userpick.contains("left")){
                   left();
               }else if(userpick.contains("right")){
                   right();
               }
   }
        static void left() {
           System.out.println("You decide to go left but now there is a" +/*enemyobject*/"goblin.");
           System.out.println("You fight valiantly as a " +fightingclass+ " and kill the goblin but lose 30 HP.");
           ninety();
           System.out.println("You keep heading down the corridoor and find a trap door.");
           System.out.println("When you climb down its really dark so you light a torch.");
           System.out.println("To your left is a door. You can keep moving foward but you hear something like a blade swinging.");
           System.out.println("What will you do, "+username+"? Door or keep going?");
            Scanner userchoice = new Scanner(System.in);
            userpick = userchoice.nextLine().toLowerCase();
            if (userpick.contains("door")){
                door();
            }else if (userpick.contains("keep going")){
                forward();
            }
        }       
        static void right(){
            System.out.println("There was a death trap but you manage to avoid the arrows flying out the wall,ecept for one which hit your chest making you lose 50HP.");
            fifty();
            System.out.println("You escape and keep heading foward. To your left is a door. You can keep moving foward but you hear something like a blade swinging.");
            System.out.println("What will you do, "+username+"? Door or keep going?");
            Scanner userchoice = new Scanner(System.in);
            userpick = userchoice.nextLine().toLowerCase();
            if (userpick.contains("door")){
                door();
            }else if (userpick.contains("keep going")){
                forward();
            }
        }

            static void door(){
                 System.out.println("Now you have gone through the door and you see a light glinting down the hallway. ");
                 System.out.println("You peep around the corner and see that it is the big pile of gold.");
                 System.out.println("You run in and fight the goblins that guard it.");
                 System.out.println("Do you dodge or block the attack from the goblins?");
                 Scanner userchoice = new Scanner(System.in);
                 userpick = userchoice.nextLine().toLowerCase();
                 if (userpick.contains("block")){
                     block();
                     
                 }else if (userpick.contains("dodge")){
                     dodge();
                 }
            }
            static void block(){
                System.out.println("You tried to block but the goblin's attack was too powerful and killed you.");
                died();
            }
            static void dodge(){
                System.out.println("You dodged the attack and hit the goblin with your weapon.");
                System.out.println("The goblin died.");
                System.out.println("You have killed the goblins and n;ow the gold is yours. Well done!");
               /*#win*/ System.out.println("You Win!");
                
                
                
                
            }
            
            
            
            
            
            
            
            
            
            
            static void forward(){
                System.out.println("As you head forward the swinging noise you heard was a trap that had swinging axes.");
                System.out.println("You didn't realize this until an axe swung at you and chopped your head off");
                died();
            }
            static void ninety5(){
                System.out.println("[=========-]");
                System.out.println("");
            }
            static void ninety(){
                System.out.println("[=========]");
            }
            static void eighty5(){
                System.out.println("[========-]");
            }
            static void eighty(){
                System.out.println("[========]");
            }
            static void seventy5(){
                System.out.println("[=======-]");
            }
            static void seventy(){
                System.out.println("[=======]");
            }
              static void sixty5(){
                System.out.println("[======-]");
            }
                static void sixty(){
                System.out.println("[======]");
            }
                  static void fifty5(){
                System.out.println("[=====-]");
            }
                    static void fifty(){
                System.out.println("[=====]");
            }
                      static void forty5(){
                System.out.println("[====-]");
            }
                        static void forty(){
                System.out.println("[====]");
            }
                          static void thirty5(){
                System.out.println("[===-]");
            } 
                          static void thirty(){
                System.out.println("[===]");
            }  
                          static void twenty5(){
                System.out.println("[==-]");
            }
                            static void twenty(){
                System.out.println("[==]");
            }
                              static void fifteen(){
                System.out.println("[=-]");
            }
                                static void ten(){
                System.out.println("[=]");
            }
                                static void five(){
                                    System.out.println("[-]");
                                }
                                static void died(){
                                    System.out.println("[] You have died. Try again?");
                                }
                                        
            }










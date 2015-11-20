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
    static Scanner choose = new Scanner(System.in);
    static boolean archeristrue;
    static boolean warrioristrue;
    static boolean mageistrue;
    static boolean thiefistrue;
    static Scanner userinputname = new Scanner(System.in);
    static Scanner userchoice = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome To Souls of Infinite");
        System.out.println("Enter the name you wish to be called.");

        username = userinputname.nextLine();
       /*#Hero*/ System.out.println("OK " + username + ", your objective is to steal all of the goblin's gold");

        /*This method lets me choose the kind of fighter I am*/chooseclass();
        fight();

    }

    /*#method1*/static void chooseclass() {
        System.out.println("Warrior[W], Mage[M], Archer[A], or Thief[T]");
        userpick = userchoice.nextLine().toLowerCase();
        if (userpick.contains("w")) {
            warrior();

        } else if (userpick.contains("m")) {
            
            mage();

           warrior();

        } else if (userpick.contains("arch")) {
            archer();

        }

        warrior();

    }

   /*#method2*/ static void warrior() {

        System.out.println("You have chosen the path of the sword.");
    }

    /*#method3*/static void mage() {
        Scanner userchoice = new Scanner(System.in);
        userpick = userchoice.nextLine();
        if ("M".equals(userpick)) {
            System.out.println("You have chosen the arcane arts.");
        }
    }

    /*#method4*/static void archer() {
        Scanner userchoice = new Scanner(System.in);
        userpick = userchoice.nextLine();
        if ("A".equals(userpick)) {
            System.out.println("You have chosen the way of the Bow and Arrow");
        }
    }

    /*#method5*/static void thief() {
        Scanner userchoice = new Scanner(System.in);
        userpick = userchoice.nextLine();
        if ("T".equals(userpick)) {
            System.out.println("You have chosen the path of thievery.");
        }
    }
   /*#method6*/ static void fight(){
        //In this method you're supposed to fight a dragon but until i'm able to choose the class, this method won't be finished.*/
        
    }
}


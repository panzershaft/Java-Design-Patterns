package factory_method.tanks_example.client;

import factory_method.tanks_example.client.creator.GermanTank;
import factory_method.tanks_example.client.creator.RussianTank;
import factory_method.tanks_example.client.creator.TankFactory;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){

        TankFactory GermanLightTank = new GermanTank("Panzerkampfwagen I",
                5400, 4.02, 2.06,  2.06, 2 );
        TankFactory GermanHeavyTank = new GermanTank(
                "Panzerkampfwagen VI Tiger Ausf. E",
                54000, 8.45, 2.06,  3.56, 5 );

        TankFactory RussianLightTank = new RussianTank("BT-2",
                11500, 5.58, 2.25, 2.23, 3);
        TankFactory RussianHeavyTank = new RussianTank(
                "IS-3", 46500, 9.85, 2.45,  3.15, 4 );

//        GermanHeavyTank.orderTank("light");
        Scanner Keyboard = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Please choose one the following options:");
            System.out.println("1. German Tank");
            System.out.println("2. Russian Tank");
            choice = Keyboard.nextInt();

        }while (!(choice == 1 || choice == 2));

        if(choice == 1){
            do {
                System.out.println("Choose build type: ");
                System.out.println("1. Panzerkampfwagen I (Light Tank)");
                System.out.println("2. Panzerkampfwagen VI Tiger Ausf. E (Heavy Tank)");
                choice = Keyboard.nextInt();
            }while (!(choice == 1 || choice == 2));

            if (choice == 1){
                GermanLightTank.orderTank("light");
                System.out.println(GermanLightTank);
            }else {
                GermanHeavyTank.orderTank("heavy");
                System.out.println(GermanHeavyTank);
            }
        }
        else {
            do {
                System.out.println("Choose build type: ");
                System.out.println("1. BT-2 (Light Tank)");
                System.out.println("2. IS-3 (Heavy Tank)");
                choice = Keyboard.nextInt();
            }while  (!(choice == 1 || choice == 2));

            if (choice == 1){
                RussianLightTank.orderTank("light");
                System.out.println(RussianLightTank);
            }else {
                RussianHeavyTank.orderTank("heavy");
                System.out.println(RussianHeavyTank);
            }
        }

    }
}

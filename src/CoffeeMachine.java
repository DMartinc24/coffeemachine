package machine;

import java.util.Scanner;


public class CoffeeMachine {

    private static int water = 400;
    private static int money = 550;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static String action;



    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i > count; i++) {
            chooseAction();
            if (action.equals("buy")) {
                buyCoffee();
            } else if (action.equals("fill")) {
                fill();
            } else if (action.equals("take")) {
                take();
            } else if (action.equals("remaining")) {
                statusPrint();
            }
            if (action.equals("exit")){
                break;
            }
        }
    }



    public static void buyCoffee () {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String sentence = " ";
        String sentence1 = " ";
        String sentence2 = " ";
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case "1":
                if (water >= 250 && beans >= 16 && cups >= 1) {
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (water < 250) {
                        sentence += "water";
                    } else if (beans < 16) {
                        sentence += "beans";
                    } else if (cups < 1) {
                        sentence += "cups";
                    }
                    System.out.println("Sorry, not enough" + sentence + "!");
                }
                break;
            case "2":
                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    cups -= 1;
                    System.out.println(("I have enough resources, making you a coffee!"));
                } else {
                    if (water < 350) {
                        sentence1 += "water";
                    } else if (beans < 20) {
                        sentence1 += "beans";
                    } else if (cups < 1) {
                        sentence1 += "cups";
                    } else if (milk < 75) {
                        sentence1 += "milk";
                    }
                    System.out.println("Sorry, not enough" + sentence1 + "!");
                }
                break;
            case "3":
                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (water < 200) {
                        sentence2 += "water";
                    } else if (beans < 12) {
                        sentence2 += "beans";
                    } else if (cups < 1) {
                        sentence2 += "cups";
                    } else if (milk < 100) {
                        sentence2 += "milk";
                    }
                    System.out.println("Sorry, not enough" + sentence2 + "!");
                }
                break;
            case "back":
                break;
        }
    }


    public static void statusPrint() {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        if (money > 0) {
            System.out.println("$" + money + " of money");
        } else {
            System.out.println(money + " of money");
        }
    }

    public static String chooseAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        Scanner scanner1 = new Scanner(System.in);
        action = scanner1.next();
        return action;

    }

    public static void fill(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner2.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner2.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner2.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner2.nextInt();
        System.out.println();

    }

    public static void take(){
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();

    }

}






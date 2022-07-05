package ua.ithilel.java;


public class AutoMarket {

    public static void main(String[] args) {

        Client client = new Client();
        client.name = "Valentine";
        client.age = 20;
        client.money = 21_000;

        Car mitsubishi = new Car();
        mitsubishi.name = "mitsubishi";
        mitsubishi.price = 95_000;

        if (client.age < 18) {
            System.out.println(client.name + ",sorry, you are too youang..");
            System.out.println("You need to reach 18 years olt to buy a car. So, wait more " + (18 - client.age) + " years..");
       } else if (client.money < mitsubishi.price) {
            System.out.println("Do " + client.name + " ready to take credit? - " + (client.b1));
            System.out.println("Sorry, come back later.");
        } else {
            if (client.money < mitsubishi.price) {
                System.out.println("Do " + client.name + " ready to take credit? - " + (client.b));
                System.out.println("Good, you are aduld, and have have not enought money to buy a car.");
                System.out.println("We take credit to you for 3 years. Your month payment is: " + (mitsubishi.price / 36) + " $. Congrats!");
            }
            if (client.age >= 18) {
                if (client.money >= mitsubishi.price) {
                    System.out.println("Do " + client.name + " have enought money? - " + (client.money));
                    System.out.println("Good, you are aduld, and have ability to buy a car.");
                    System.out.println("Great, you have enought money to buy brand new car!");
                    System.out.println("Congratulations!");
                }
            }
        }
    }
}
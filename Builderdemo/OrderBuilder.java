package Builderdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
    public OrderedItems preparePizza() throws IOException {
        OrderedItems itemsOrder = new OrderedItems();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the choice of Pizza ");
        System.out.println("============================");
        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Non-Veg Pizza   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");
        int pizzaandcolddrinkchoice = Integer.parseInt(br.readLine());
        switch (pizzaandcolddrinkchoice) {
            case 1: {
                System.out.println("You ordered Veg Pizza");
                System.out.println("\n\n");
                System.out.println(" Enter the Size of Veg-Pizza ");
                System.out.println("------------------------------");
                System.out.println("        1.Small Pizza        ");
                System.out.println("        2.Medium Pizza        ");
                System.out.println("        3.Large Pizza        ");
                System.out.println("        4.Exit            ");
                System.out.println("------------------------------");


                int vegpizzasize = Integer.parseInt(br.readLine());
                switch (vegpizzasize) {
                    case 1: {
                        itemsOrder.addItems(new SmallVegPizza());
                        break;
                    }
                    case 2: {
                        itemsOrder.addItems(new MediumVegPizza());
                        break;
                    }
                    case 3: {
                        itemsOrder.addItems(new LargeVegPizza());
                        break;
                    }
                    default:
                }
            }
            break;
            case 2:
            {
                System.out.println("You ordered Non-Veg Pizza");
                System.out.println("\n\n");
                System.out.println("Enter the Non-Veg pizza size");
                System.out.println("------------------------------------");
                System.out.println("    1. Small Non-Veg  Pizza ");
                System.out.println("    2. Medium Non-Veg  Pizza ");
                System.out.println("    3. Large Non-Veg  Pizza ");
                System.out.println("------------------------------------");
                int nonvegpizzasize=Integer.parseInt(br.readLine());
                switch(nonvegpizzasize)
                {
                    case 1:
                        itemsOrder.addItems(new SmallNonVegPizza());
                        break;
                    case 2:
                        itemsOrder.addItems(new MediumNonVegPizza());
                        break;
                    case 3:
                        itemsOrder.addItems(new LargeNonVegPizza());
                        break;
                }

            }
            break;
            default:
        }

        System.out.println(" Enter the choice of Cold Drink ");
        System.out.println("============================");
        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");

        int coldDrink=Integer.parseInt(br.readLine());

        switch (coldDrink)
        {
            case 1:
            {
                System.out.println("You ordered Pepsi ");
                System.out.println("Enter the  Pepsi Size ");
                System.out.println("------------------------");
                System.out.println("    1. Small Pepsi ");
                System.out.println("    2. Medium Pepsi ");
                System.out.println("    3. Large Pepsi ");
                System.out.println("------------------------");
                int pepsisize=Integer.parseInt(br.readLine());
                switch(pepsisize)
                {
                    case 1:
                        itemsOrder.addItems(new SmallPepsi());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumPepsi());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargePepsi());
                        break;
                }
            }
            break;
            case 2:
            {

                System.out.println("You ordered Coke");
                System.out.println("Enter the Coke Size");
                System.out.println("------------------------");
                System.out.println("    1. Small Coke ");
                System.out.println("    2. Medium Coke  ");
                System.out.println("    3. Large Coke  ");
                System.out.println("------------------------");

                int cokesize=Integer.parseInt(br.readLine());

                switch(cokesize)
                {
                    case 1:
                        itemsOrder.addItems(new SmallCoke());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumCoke());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargeCoke());
                        break;


                }
            }
            break;

            default:
            {
                break;
            }
        }

        return itemsOrder;
    }
}



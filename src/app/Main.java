package app;

import app.controllers.OrderAController;
import app.controllers.OrderBController;

import java.util.Scanner;

public class Main {

    static Scanner scanner;
    public  static void main(String[] args) {
        filterOption(getOption());
    }

    private static int getOption() {
        System.out.println("""
                Choose an option:
                1 - order without delivery
                2 - order with delivery
                0 - close app
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void filterOption(int option) {
        switch (option) {
            case 1 -> {
                OrderAController controller = new OrderAController();
                controller.handleData();
            }
            case 2 -> {
                OrderBController controller = new OrderBController();
                controller.handleData();
            }
            case 0 -> System.out.println("App closed");
            default -> {
                System.out.println("No such option :-(");
                filterOption(getOption());
            }
        }
    }
}

package app.models;

import app.controllers.OrderAController;
import app.controllers.OrderBController;

public class AppModel {

    public void filterOption(int option) {
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
            }
        }
    }
}

package app.models;

import app.controllers.OrderAController;
import app.controllers.OrderBController;

public class AppModel {

    public void executeOptionOne() {
        OrderAController controller = new OrderAController();
        controller.handleData();
    }

    public void executeOptionTwo() {
        OrderBController controller = new OrderBController();
        controller.handleData();
    }
}

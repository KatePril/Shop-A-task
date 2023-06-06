package app;

import app.controllers.AppController;
import app.controllers.OrderAController;
import app.controllers.OrderBController;

import java.util.Scanner;

public class Main {

    static Scanner scanner;
    public  static void main(String[] args) {
        AppController appController = new AppController();
        appController.runApp();
    }
}

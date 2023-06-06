package app.controllers;

import app.models.AppModel;
import app.utils.Constants;
import app.views.AppView;

public class AppController {

    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();

        filterOption(view.getOption(), view, model);
    }

    private void filterOption(int option, AppView view, AppModel model) {
        switch (option) {
            case 1 -> {
                model.executeOptionOne();
                runApp();
            }
            case 2 -> {
                model.executeOptionTwo();
                runApp();
            }
            case 0 -> view.getOutput(Constants.CLOSE_APP_MSG);
            default -> {
                view.getOutput(Constants.WRONG_OPTION_MSG);
                runApp();
            }
        }
    }
}

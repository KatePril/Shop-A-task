package app.controllers;

import app.models.AppModel;
import app.views.AppView;

public class AppController {

    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();

        model.filterOption(view.getOption());
    }

}

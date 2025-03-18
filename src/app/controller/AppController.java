package app.controller;

import app.entity.Product;
import app.repository.Repository;
import app.utils.Constants;
import app.view.AppView;

public class AppController {
    AppView view = new AppView();
    Repository repository = new Repository();

    public void getOutput() {
        view.displayInfo(Constants.START_MSG);
        int count = 1;
        for (Product product : repository.getRepository()) {
            view.displayInfo(count + ")" + product);
            count++;
        }
    }
}

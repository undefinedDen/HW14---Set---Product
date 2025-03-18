package app.controller;

import app.entity.Product;
import app.model.AppModel;
import app.repository.Repository;
import app.utils.Constants;
import app.view.AppView;

public class AppController {
    AppView view = new AppView();
    Repository repository = new Repository();
    AppModel model = new AppModel();

    public void getOutput() {
        view.displayInfo(Constants.START_MSG);
        int count = 0;
        for (Product product : repository.getRepository()) {
            view.displayInfo(count + ")" + product + "\n");
            count++;
        }
        int index = view.getInputIndex();
            model.getProduct(repository.getRepository(), index);
    }
}

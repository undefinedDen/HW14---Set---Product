package app.model;

import app.entity.Product;
import app.repository.Repository;
import app.view.AppView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppModel {
    AppView view = new AppView();
    Repository repository = new Repository();
    public void getProduct(Set<Product> product, int index){
        //перезаписываем данные с коллекции Set в List
        // для того что бы можно было получить элемент по индекс, при помощи метода get()
        //можно было бы и через iterator() но как по мне то в данном случае метод перезаписи в List удобнее
        List<Product> products = new ArrayList<>(product);
        try{
            System.out.print(products.get(index));
        }catch (IndexOutOfBoundsException e){
            view.displayInfo("Exception" + e.getMessage());
        }
    }
}

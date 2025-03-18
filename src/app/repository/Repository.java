package app.repository;

import app.entity.Product;
import java.util.HashSet;
import java.util.Set;

public class Repository {
    public Set<Product> getRepository(){
        Set<Product> repository = new HashSet<>();
        repository.add(new Product("Apple", 100, 1.2));
        repository.add(new Product("Banana" , 55, 1.4));
        repository.add(new Product("Apple" , 104, 1.2));
        repository.add(new Product("Mango", 250, 2.25));
        repository.add(new Product("Apple", 100, 1.2));
        return repository;
    }
}

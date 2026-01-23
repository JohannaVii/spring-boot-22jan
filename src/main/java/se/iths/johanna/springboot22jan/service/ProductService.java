package se.iths.johanna.springboot22jan.service;

import org.springframework.stereotype.Service;
import se.iths.johanna.springboot22jan.model.Product;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getProductList() {
        return List.of(
                new Product(1001, "Roses", "Red rose", 39.90, "Romantic classic flower"),
                new Product(1002, "Roses", "White rose", 29.90, "Simple and clean flower"),
                new Product(2001, "Tulips", "Red tulip", 19.90, "Popular flower")
        );
    }
}

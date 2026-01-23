package se.iths.johanna.springboot22jan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.johanna.springboot22jan.service.ProductService;

@Controller
public class ProductController {

    private final ProductService productService;

    // Constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String productlist(Model model) {

        //List<Product> products = List.of(
        //new Product(1001, "Roses", "Red rose", 39.90, "Romantic classic flower"),
        //new Product(1002, "Roses", "White rose", 29.90, "Simple and clean flower"),
        //new Product(2001, "Tulips", "Red tulip", 19.90, "Popular flower")
        //);

        //model.addAttribute("products", products);

        model.addAttribute("products", productService.getProductList());

        return "products";
    }
}

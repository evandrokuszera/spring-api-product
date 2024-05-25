package spring_api.product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import spring_api.product.model.Product;
import spring_api.product.model.ProductDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(ProductDTO productDTO){
        products.add(new Product(
                products.size() + 1,
                productDTO.description(),
                productDTO.quantity(),
                productDTO.price()
        ));
    }

    public List<Product> getProducts(){
        return products;
    }

    public void populate(){
        List<Product> listOfProducts = List.of(
            new Product(1, "Notebook", 10, new BigDecimal(3500)),
            new Product(2, "Desktop", 50, new BigDecimal(2500)),
            new Product(3, "Server", 10, new BigDecimal(12000)),
            new Product(4, "Raspberry 4", 80, new BigDecimal(800)),
            new Product(5, "ESP32", 20, new BigDecimal(120))
        );

        this.products.addAll(listOfProducts);
    }
}

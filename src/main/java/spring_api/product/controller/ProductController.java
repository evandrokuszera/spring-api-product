package spring_api.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring_api.product.model.Product;
import spring_api.product.model.ProductDTO;
import spring_api.product.service.ProductService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok().body(productService.getProducts());
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody ProductDTO productDTO){
        this.productService.addProduct(productDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping(path = "/populate")
    @ResponseStatus(HttpStatus.OK)
    public void populate(){
        this.productService.populate();
    }

}

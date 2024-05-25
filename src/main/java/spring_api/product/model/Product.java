package spring_api.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String description;
    private Integer quantity;
    private BigDecimal price;
}

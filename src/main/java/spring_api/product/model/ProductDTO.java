package spring_api.product.model;

import java.math.BigDecimal;

public record ProductDTO(String description, Integer quantity, BigDecimal price) {
}

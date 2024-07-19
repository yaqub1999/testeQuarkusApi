package br.com.rest.model.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ProductDto {
    private Long id;

    private String productName;
    
    private String brand;
    
    private String batch;
    
    private String barCode;
    
    private BigDecimal price;
    
    private Long amount;
}

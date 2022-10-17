package github.mrfjz.ecommerce.productcatalogservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProductColumnNotNullableException extends RuntimeException{
    private String message;
}

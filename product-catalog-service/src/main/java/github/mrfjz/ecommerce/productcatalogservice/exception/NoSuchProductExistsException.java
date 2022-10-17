package github.mrfjz.ecommerce.productcatalogservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@AllArgsConstructor
public class NoSuchProductExistsException extends RuntimeException{
    private String message;
}

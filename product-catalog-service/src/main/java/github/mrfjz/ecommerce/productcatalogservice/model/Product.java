package github.mrfjz.ecommerce.productcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal price;

    private String description;
    private String category;
    private Integer availability;
//    private Long categoryId;
//    private Long inventoryId;
//    private Instant createdAt;
//    private Instant modifiedAt;
//    private Instant deletedAt;
}

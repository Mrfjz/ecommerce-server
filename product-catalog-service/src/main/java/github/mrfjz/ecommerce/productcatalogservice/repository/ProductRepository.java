package github.mrfjz.ecommerce.productcatalogservice.repository;

import github.mrfjz.ecommerce.productcatalogservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory(String category);
    List<Product> findAllByName(String name);
}

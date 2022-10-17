package github.mrfjz.ecommerce.productcatalogservice.service;

import github.mrfjz.ecommerce.productcatalogservice.exception.NoSuchProductExistsException;
import github.mrfjz.ecommerce.productcatalogservice.exception.ProductColumnNotNullableException;
import github.mrfjz.ecommerce.productcatalogservice.model.Product;
import github.mrfjz.ecommerce.productcatalogservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductByCategory(String category) {
        return productRepository.findAllByCategory(category);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(
                () -> new NoSuchProductExistsException(String.format("Product with id %s not exist", id))
        );
    }

    @Override
    public List<Product> getAllProductsByName(String name) {
        return productRepository.findAllByName(name);
    }

    @Override
    public Product addProduct(Product product) {
        if (product.getName() == null || product.getPrice() == null){
            throw new ProductColumnNotNullableException("fields 'name' and 'price' are required");
        }
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

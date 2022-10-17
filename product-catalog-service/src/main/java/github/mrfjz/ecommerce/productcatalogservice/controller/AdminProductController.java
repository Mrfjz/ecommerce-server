package github.mrfjz.ecommerce.productcatalogservice.controller;

import github.mrfjz.ecommerce.productcatalogservice.model.Product;
import github.mrfjz.ecommerce.productcatalogservice.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/products")
public class AdminProductController {
    private final ProductService productService;

    public AdminProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
            return ResponseEntity.ok(productService.addProduct(product));
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product newProduct){
//        return ResponseEntity.ok(productService.updateProduct(id, newProduct));
//    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

}

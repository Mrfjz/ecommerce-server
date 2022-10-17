package github.mrfjz.ecommerce.productcatalogservice.controller;

import github.mrfjz.ecommerce.productcatalogservice.model.Product;
import github.mrfjz.ecommerce.productcatalogservice.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        var Products = productService.getAllProduct();
        return ResponseEntity.ok(Products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping(params = "{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@RequestParam ("category") String category){
        var Products = productService.getAllProductByCategory(category);
        return ResponseEntity.ok(Products);
    }

    @GetMapping(params = "{name}")
    public ResponseEntity<List<Product>> getProductsByName(@RequestParam ("name") String name){
        var Products = productService.getAllProductsByName(name);
        return ResponseEntity.ok(Products);
    }

}

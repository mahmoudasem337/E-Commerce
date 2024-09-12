package asem.e_commerce.Controller;

import asem.e_commerce.Entity.Product;
import asem.e_commerce.Entity.User;
import asem.e_commerce.Service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductServiceImpl productService;
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
    //Done
    @PostMapping("/secure/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    //Done
    @DeleteMapping("/secure/product/{id}")
    public void deleteProduct(@PathVariable int id){
         productService.deleteProduct(id);
    }
}

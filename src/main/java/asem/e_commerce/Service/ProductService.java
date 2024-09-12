package asem.e_commerce.Service;

import asem.e_commerce.Entity.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public void deleteProduct(int id);
    public List<Product> getAllProducts();
}

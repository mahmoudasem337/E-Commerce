package asem.e_commerce.Service;

import asem.e_commerce.Entity.Brand;

import java.security.PublicKey;

public interface BrandService {
    public void addBrand(Brand brand);
    public void deleteBrand(int id);
}

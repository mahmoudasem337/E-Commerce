package asem.e_commerce.Service;

import asem.e_commerce.Entity.Brand;
import asem.e_commerce.Repository.BrandRepository;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService{

    private final BrandRepository brandRepository;
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(int id) {
         brandRepository.deleteById(id);
    }
}

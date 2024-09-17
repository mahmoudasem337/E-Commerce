package asem.e_commerce.Controller;

import asem.e_commerce.Entity.Brand;
import asem.e_commerce.Service.BrandServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BrandController {

    private final BrandServiceImpl brandService;
    public BrandController(BrandServiceImpl brandService) {
        this.brandService = brandService;
    }

    @PostMapping("/secure/brand")
    public void addBrand(@RequestBody Brand brand){
        brandService.addBrand(brand);
    }
    //Done
    @DeleteMapping("/secure/brand/{id}")
    public void deleteBrand(@PathVariable int id){
        brandService.deleteBrand(id);
    }
}

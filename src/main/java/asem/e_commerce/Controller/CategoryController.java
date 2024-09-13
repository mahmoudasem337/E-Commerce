package asem.e_commerce.Controller;

import asem.e_commerce.Entity.Category;
import asem.e_commerce.Entity.User;
import asem.e_commerce.Service.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/secure")
public class CategoryController {
    private final CategoryServiceImpl categoryService;
    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping("/category")
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }
    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable int id){
         categoryService.deleteCategory(id);
    }
}

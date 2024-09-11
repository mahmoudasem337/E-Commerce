package asem.e_commerce.Controller;

import asem.e_commerce.Entity.Address;
import asem.e_commerce.Entity.User;
import asem.e_commerce.Service.AddressService;
import asem.e_commerce.Service.AddressServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AddressController {

    private final AddressServiceImpl addressService;
    public AddressController(AddressServiceImpl addressService) {
        this.addressService = addressService;
    }
    @GetMapping("/addresses")
    public List<Address> getAddresses(){
        return addressService.getAddresses();
    }
    //Done
    @GetMapping("/address/{id}")
    public Optional<Address> getAddress(@PathVariable int id){
        return addressService.getAddress(id);
    }
    //Done
    @PostMapping("/secure/address")
    public Address addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    //Done
    @DeleteMapping("/secure/address/{id}")
    public void deleteAddress(@PathVariable int id){
        addressService.deleteAddress(id);
    }
}

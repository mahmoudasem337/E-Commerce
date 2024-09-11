package asem.e_commerce.Service;

import asem.e_commerce.Entity.Address;
import asem.e_commerce.Repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{
private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }
    @Override
    public Optional<Address> getAddress(int id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }
}

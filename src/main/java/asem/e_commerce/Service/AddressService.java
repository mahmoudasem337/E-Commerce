package asem.e_commerce.Service;

import asem.e_commerce.Entity.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    public Address addAddress(Address address);
    public void deleteAddress(int id);
    public Optional<Address> getAddress(int id);
    public List<Address> getAddresses();
}

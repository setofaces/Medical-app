package liga.medical.service.impl;

import liga.medical.dto.AddressDto;
import liga.medical.mapper.AddressMapper;
import liga.medical.repository.AddressRepository;
import liga.medical.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    AddressRepository repository;
    AddressMapper mapper;

    public AddressServiceImpl(AddressRepository repository, AddressMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public AddressDto findById(Long id) {
        return mapper.modelToDto(repository.findById(id));
    }

    @Override
    public void addOrUpdate(AddressDto addressDto) {

    }

    @Override
    public List<AddressDto> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    }
}

package liga.medical.service.impl;

import liga.medical.dto.ContactDto;
import liga.medical.mapper.ContactMapper;
import liga.medical.repository.ContactRepository;
import liga.medical.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    ContactRepository repository;
    ContactMapper mapper;

    public ContactServiceImpl(ContactRepository repository, ContactMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ContactDto findById(Long id) {
        return null;
    }

    @Override
    public void addOrUpdate(ContactDto contactDto) {
    }

    @Override
    public List<ContactDto> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

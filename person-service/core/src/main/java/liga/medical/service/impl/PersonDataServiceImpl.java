package liga.medical.service.impl;

import liga.medical.dto.PersonDataDto;
import liga.medical.mapper.PersonDataMapper;
import liga.medical.model.PersonData;
import liga.medical.repository.PersonDataRepository;
import liga.medical.service.PersonDataService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDataServiceImpl implements PersonDataService, UserDetailsService {
    PersonDataRepository repository;
    PersonDataMapper mapper;

    public PersonDataServiceImpl(PersonDataRepository repository, PersonDataMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PersonDataDto findById(Long id) {
        return mapper.modelToDto(repository.findById(id));
    }

    @Override
    public void addOrUpdate(PersonDataDto personDataDto) {

    }

    @Override
    public List<PersonDataDto> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public PersonData loadUserByUsername(String s) throws UsernameNotFoundException {
        return repository.findByEmail(s);
    }
}

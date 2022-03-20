package liga.medical.service.impl;

import liga.medical.dto.PersonDataDto;
import liga.medical.mapper.PersonDataMapper;
import liga.medical.repository.PersonDataRepository;
import liga.medical.service.PersonalDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDataServiceImpl implements PersonalDataService {
    PersonDataRepository repository;
    PersonDataMapper mapper;

    public PersonDataServiceImpl(PersonDataRepository repository, PersonDataMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PersonDataDto findById(Long id) {
        return null;
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
}

package liga.medical.service.impl;

import liga.medical.dto.MedicalCardDto;
import liga.medical.mapper.MedicalCardMapper;
import liga.medical.repository.MedicalCardRepository;
import liga.medical.service.MedicalCardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCardServiceImpl implements MedicalCardService {

    MedicalCardRepository repository;
    MedicalCardMapper mapper;

    public MedicalCardServiceImpl(MedicalCardRepository repository, MedicalCardMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public MedicalCardDto findById(Long id) {
        return null;
    }

    @Override
    public void addOrUpdate(MedicalCardDto medicalCardDto) {

    }

    @Override
    public List<MedicalCardDto> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

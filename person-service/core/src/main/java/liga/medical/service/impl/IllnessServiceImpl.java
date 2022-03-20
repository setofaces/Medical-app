package liga.medical.service.impl;

import liga.medical.dto.IllnessDto;
import liga.medical.mapper.IllnessMapper;
import liga.medical.repository.IllnessRepository;
import liga.medical.service.IllnessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessServiceImpl implements IllnessService {
    IllnessRepository repository;
    IllnessMapper mapper;

    public IllnessServiceImpl(IllnessRepository repository, IllnessMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IllnessDto findById(Long id) {
        return null;
    }

    @Override
    public void addOrUpdate(IllnessDto illnessDto) {

    }

    @Override
    public List<IllnessDto> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

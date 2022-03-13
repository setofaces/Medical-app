package api;

import dto.MedicalHistoryDto;

import java.util.List;

public interface MedicalHistoryService {
    MedicalHistoryDto findById(Long id);

    List<MedicalHistoryDto> getAll();

    void deleteById(Long id);

    void saveOrUpdate(MedicalHistoryDto medicalHistoryDto);
}

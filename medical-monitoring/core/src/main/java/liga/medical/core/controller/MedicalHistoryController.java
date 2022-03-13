package liga.medical.core.controller;

import api.MedicalHistoryService;
import dto.MedicalHistoryDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/medical")
public class MedicalHistoryController {

    private final MedicalHistoryService mhService;

    public MedicalHistoryController(MedicalHistoryService mhService) {

        this.mhService = mhService;
    }

    @GetMapping
    public List<MedicalHistoryDto> getAll() {
        return mhService.getAll();
    }

    @GetMapping("/{id}")
    public MedicalHistoryDto findById(@PathVariable Long id) {
        return mhService.findById(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody @Valid MedicalHistoryDto medicalHistoryDto) {
        mhService.saveOrUpdate(medicalHistoryDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        mhService.deleteById(id);
    }

}

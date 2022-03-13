package liga.medical.core.controller;

import api.PatientService;
import dto.PatientDto;
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
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/{id}")
    public PatientDto findById(@PathVariable Long id) {
        return patientService.findById(id);
    }

    @GetMapping
    public List<PatientDto> getAll() {
        return patientService.findAll();
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody @Valid PatientDto patientDto) {
        patientService.saveOrUpdate(patientDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        patientService.deleteById(id);
    }

}

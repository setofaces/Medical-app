package liga.medical.controller;

import liga.medical.dto.MedicalCardDto;

import liga.medical.service.MedicalCardService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/medical_card")
@RestController
public class MedicalCardController {

    MedicalCardService service;

    public MedicalCardController(MedicalCardService service) {
        this.service = service;
    }

    @GetMapping
    public List<MedicalCardDto> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody MedicalCardDto medicalCardDto) {
        service.addOrUpdate(medicalCardDto);
    }

    @GetMapping("/{id}")
    public MedicalCardDto getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}

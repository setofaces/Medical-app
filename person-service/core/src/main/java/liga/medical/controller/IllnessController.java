package liga.medical.controller;

import liga.medical.dto.IllnessDto;
import liga.medical.service.IllnessService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/illness")
@RestController
public class IllnessController {
    IllnessService service;

    public IllnessController(IllnessService service) {
        this.service = service;
    }

    @GetMapping
    public List<IllnessDto> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody IllnessDto illnessDto) {
        service.addOrUpdate(illnessDto);
    }

    @GetMapping("/{id}")
    public IllnessDto getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}

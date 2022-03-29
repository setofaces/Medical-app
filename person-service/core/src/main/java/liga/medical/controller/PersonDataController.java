package liga.medical.controller;

import liga.medical.dto.PersonDataDto;
import liga.medical.logging.Loggable;
import liga.medical.service.PersonDataService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Loggable
@RequestMapping("/person_data")
@RestController
public class PersonDataController {

    PersonDataService service;

    public PersonDataController(PersonDataService service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonDataDto> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody PersonDataDto personDataDto) {
        service.addOrUpdate(personDataDto);
    }

    @GetMapping("/{id}")
    public PersonDataDto getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}

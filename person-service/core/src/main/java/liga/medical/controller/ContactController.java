package liga.medical.controller;

import liga.medical.dto.ContactDto;
import liga.medical.service.ContactService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/contact")
@RestController
public class ContactController {
    ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContactDto> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody ContactDto contactDto) {
        service.addOrUpdate(contactDto);
    }

    @GetMapping("/{id}")
    public ContactDto getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}

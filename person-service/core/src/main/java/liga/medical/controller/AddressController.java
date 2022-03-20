package liga.medical.controller;

import liga.medical.dto.AddressDto;
import liga.medical.service.AddressService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/address")
@RestController
public class AddressController {

    AddressService service;

    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping
    public List<AddressDto> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody AddressDto addressDto) {
        service.addOrUpdate(addressDto);
    }

    @GetMapping("/{id}")
    public AddressDto getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}

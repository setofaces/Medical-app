package liga.medical;

import liga.medical.model.PersonData;
import liga.medical.model.Role;
import liga.medical.repository.ContactRepository;
import liga.medical.repository.MedicalCardRepository;
import liga.medical.repository.PersonDataRepository;
import liga.medical.service.PersonDataService;
import liga.medical.service.RoleService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Set;

@Component
public class Init {

    private final RoleService roleService;
    private final PersonDataRepository repository;
    private final MedicalCardRepository medicalCardRepository;
    private final ContactRepository contactRepository;

    public Init(RoleService roleService, PersonDataRepository repository,
                MedicalCardRepository medicalCardRepository, ContactRepository contactRepository) {
        this.roleService = roleService;
        this.repository = repository;
        this.medicalCardRepository = medicalCardRepository;
        this.contactRepository = contactRepository;
    }

    @PostConstruct
    public void init() {
        /*Role admin = new Role("ROLE_ADMIN");
        Role patient = new Role("ROLE_PATIENT");
        roleService.saveRole(admin);
        roleService.saveRole(patient);

        PersonData firstPerson = new PersonData();
        firstPerson.setAge(32);
        firstPerson.setFirstName("a");
        firstPerson.setLastName("b");
        firstPerson.setBirthDt(LocalDate.of(2000,2,2));
        firstPerson.setEmail("buba");
        firstPerson.setPassword("buba");
        firstPerson.setSex('M');
        firstPerson.setMedicalCardId(1l);
        firstPerson.setContactId(1l);
        firstPerson.setRoles(Set.of(admin,patient));
        firstPerson.setEnabled(true);
        repository.add(firstPerson);*/
    }
}

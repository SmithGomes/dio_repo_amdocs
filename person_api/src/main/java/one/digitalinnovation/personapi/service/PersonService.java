package one.digitalinnovation.personapi;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.exceptions.PersonNotFoundException;
import one.digitalinnovation.personapi.mapper.PersonMapper;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonDTO> listAll(  ){
        List<Person> people = personRepository.findAll();
        return people.stream()
                .map( personMapper::toDTO )
                .collect( Collectors.toList() );
    }



    public PersonDTO findById( Long id ) throws PersonNotFoundException {
        Person person = userExists(id);
        return personMapper.toDTO( person );
    }

    public void deleteById(Long id) throws PersonNotFoundException {
        userExists(id);
        personRepository.deleteById( id );
    }

    public MessageResponseDTO updateById( Long id, PersonDTO person ) throws PersonNotFoundException {
        userExists( id );
        Person personToUpdate = personMapper.toModel( person );
        Person updatedPerson = personRepository.save( personToUpdate );
        return createMessageResponse( updatedPerson.getId(), "Updated person with ID = " );
    }



    public MessageResponseDTO createPerson( PersonDTO person ) {
        Person personToSave = personMapper.toModel( person );
        Person savedPerson = personRepository.save(personToSave);
        return createMessageResponse(savedPerson.getId(),"Updated person with ID = " );
    }

    private MessageResponseDTO createMessageResponse( Long id, String message ) {
        return MessageResponseDTO
                .builder()
                .message( message + id )
                .build();
    }

    private Person userExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }
}
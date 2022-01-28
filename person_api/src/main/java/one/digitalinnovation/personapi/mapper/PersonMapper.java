package one.digitalinnovation.personapi.mapper;

<<<<<<< HEAD
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
=======
import org.mapstruct.Mapper;
>>>>>>> ba063472e671336ffa8fb593d7e5bb938abfac50
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

<<<<<<< HEAD
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "yyyy-MM-dd")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
=======
    //Person toModel(PersonDTO personDTO);

    //PersonDTO toDTO(Person person);
}
>>>>>>> ba063472e671336ffa8fb593d7e5bb938abfac50

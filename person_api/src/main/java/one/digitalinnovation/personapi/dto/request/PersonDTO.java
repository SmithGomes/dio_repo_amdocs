package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
=======

>>>>>>> ba063472e671336ffa8fb593d7e5bb938abfac50
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

<<<<<<< HEAD
    @NotEmpty
    @Size( min = 2, max=15 )
    private String firstName;

    @NotEmpty
    @Size( min = 2, max=25 )
    private String lastName;

    @NotEmpty
    @CPF
=======
    private String firstName;

    private String lastName;

>>>>>>> ba063472e671336ffa8fb593d7e5bb938abfac50
    private String cpf;

    private String birthDate;

<<<<<<< HEAD
    @Valid
    @NotEmpty
=======
>>>>>>> ba063472e671336ffa8fb593d7e5bb938abfac50
    private List<PhoneDTO> phones;
}

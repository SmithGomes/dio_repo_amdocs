package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

<<<<<<< HEAD
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

=======
>>>>>>> ba063472e671336ffa8fb593d7e5bb938abfac50
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

<<<<<<< HEAD
    @Enumerated( EnumType.STRING )
    private PhoneType type;

    @NotEmpty
    @Size( min = 13, max=14 )
=======
    private PhoneType type;

>>>>>>> ba063472e671336ffa8fb593d7e5bb938abfac50
    private String number;
}

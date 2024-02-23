package dinodidiodoro.U5W7L5.reqDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record EventDTO(

        @NotBlank(message = "'title' field is required and must not be empty")
        String title,
        @NotBlank(message = "'description' field is required and must not be empty")
        String description,
        @NotBlank(message = "'date' field is required and must not be empty")
        @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$",
                message = "Malformed 'date' field since it must exactly respect the pattern 'yyyy-mm-dd'"
        )
        String date,
        @NotNull(message = "'totalPlaces' field is required")
        @Min(value = 1, message = "'totalPlaces' must be an integer number major than 0")
        Integer totalPlaces
) {
}
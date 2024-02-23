package dinodidiodoro.U5W7L5.reqDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginDTO(
        @NotBlank(message = "'email' is required and must not be empty")
        @Email(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "malformed 'email' field")
        String email,
        @NotBlank(message = "'password' is required and must not be empty")
        @Size(min = 8, message = "'password' must contain at least 8 characters")
        String password

) {}
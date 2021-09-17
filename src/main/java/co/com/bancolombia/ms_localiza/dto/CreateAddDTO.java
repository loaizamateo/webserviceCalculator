package co.com.bancolombia.ms_localiza.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class CreateAddDTO {

    @NotEmpty(message = "intA cannot be empty")
    @Pattern(regexp="[0-9]+", message="Please provide a valid intA")
    private Integer number1;

    @NotEmpty(message = "intB cannot be empty")
    @Pattern(regexp="[0-9]+", message="Please provide a valid intB")
    private Integer number2;

}

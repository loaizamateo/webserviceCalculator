package co.com.bancolombia.ms_localiza.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class GenericResponse<T> {

    private int code;
    private String message;
    @JsonInclude(content = JsonInclude.Include.NON_NULL)
    private T data;

}

package co.com.bancolombia.ms_localiza;

import co.com.bancolombia.ms_localiza.model.GenericResponse;

public interface ICaculatorClient {
    GenericResponse<AddResponse> getAddResponse(Integer intA, Integer intB);
}

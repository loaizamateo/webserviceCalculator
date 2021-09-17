package co.com.bancolombia.ms_localiza.controller;

import co.com.bancolombia.ms_localiza.services.CalculatorClient;
import co.com.bancolombia.ms_localiza.dto.CreateAddDTO;
import co.com.bancolombia.wsdl.AddResponse;
import co.com.bancolombia.wsdl.DivideResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "calculator")
public class CalculatorController {

    private final CalculatorClient service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/add")
    @ResponseBody
    ResponseEntity<AddResponse> getAddResult(@Valid @RequestBody CreateAddDTO createAddDTO) {
        try {
            AddResponse resultado = service.getAddResponse(createAddDTO.getNumber1(), createAddDTO.getNumber2());
            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            AddResponse resultado = new AddResponse();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultado);
        }

    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/divide")
    @ResponseBody
    ResponseEntity<DivideResponse> getDivideResult(@Valid @RequestBody CreateAddDTO createAddDTO) {
        try {
            DivideResponse resultado = service.getDivideResponse(createAddDTO.getNumber1(), createAddDTO.getNumber2());
            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            DivideResponse resultado = new DivideResponse();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultado);
        }

    }
}

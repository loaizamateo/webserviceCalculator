package co.com.bancolombia.ms_localiza.services;

import co.com.bancolombia.wsdl.Add;
import co.com.bancolombia.wsdl.AddResponse;
import co.com.bancolombia.wsdl.Divide;
import co.com.bancolombia.wsdl.DivideResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class CalculatorClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(CalculatorClient.class);

    public AddResponse getAddResponse(Integer intA, Integer intB) {

        Add request = new Add();
        request.setIntA(intA);
        request.setIntB(intB);

        log.info("ADD: Requesting location for " + intA + " " + intB);

        AddResponse response = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", request,
                        new SoapActionCallback(
                                "http://tempuri.org/Add"));

        return response;
    }

    public DivideResponse getDivideResponse(Integer intA, Integer intB) {

        Divide request = new Divide();
        request.setIntA(intA);
        request.setIntB(intB);

        log.info("DIVIDE: Requesting location for " + intA + " " + intB);

        DivideResponse response = (DivideResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", request,
                        new SoapActionCallback(
                                "http://tempuri.org/Divide"));

        return response;
    }

}

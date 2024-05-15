package pt.jorgeduarte.javaswaggergenerator.presentation.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pt.jorgeduarte.javaswaggergenerator.swagger.api.GreetingApi;
import pt.jorgeduarte.javaswaggergenerator.swagger.model.GetGreeting200Response;

@RestController("Greeting")
public class GreetingController implements GreetingApi {

    public ResponseEntity<GetGreeting200Response> getGreeting(){
        var response = new GetGreeting200Response();
        response.setMessage("hello world");
        return ResponseEntity.ok(response);
    }

}

package pt.jorgeduarte.javaswaggergenerator.presentation.controllers;

import io.swagger.api.GreetingApi;
import io.swagger.model.InlineResponse200;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController("Greeting")
public class GreetingController implements GreetingApi {
    @Override
    public ResponseEntity<InlineResponse200> getGreeting() {
        var response = new InlineResponse200();
        response.setMessage("hello world");
        return ResponseEntity.ok(response);
    }
}

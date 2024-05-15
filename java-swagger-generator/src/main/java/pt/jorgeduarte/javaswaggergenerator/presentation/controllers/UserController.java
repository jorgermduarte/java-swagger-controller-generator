package pt.jorgeduarte.javaswaggergenerator.presentation.controllers;


import io.swagger.api.UserApi;
import io.swagger.model.Body;
import io.swagger.model.InlineResponse201;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    public ResponseEntity<InlineResponse201> createUser(Body body) {
       var testResponse =  new InlineResponse201();
       testResponse.setEmail(body.getEmail());
       testResponse.setName(body.getName());
       testResponse.setId(1);
       return ResponseEntity.ok(testResponse);
    }
}

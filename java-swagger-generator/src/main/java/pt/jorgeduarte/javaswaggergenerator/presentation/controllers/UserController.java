package pt.jorgeduarte.javaswaggergenerator.presentation.controllers;


import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pt.jorgeduarte.javaswaggergenerator.swagger.api.UserApi;
import pt.jorgeduarte.javaswaggergenerator.swagger.model.CreateUser201Response;
import pt.jorgeduarte.javaswaggergenerator.swagger.model.CreateUserRequest;

@RestController
public class UserController implements UserApi {
    public ResponseEntity<CreateUser201Response> createUser(
            @Parameter(name = "CreateUserRequest", description = "New user data", required = true) @Valid @RequestBody CreateUserRequest createUserRequest
    ) {
       var testResponse =  new CreateUser201Response();
       testResponse.setEmail(createUserRequest.getEmail());
       testResponse.setName(createUserRequest.getName());
       testResponse.setId(1);
       return ResponseEntity.ok(testResponse);
    }
}

package org.ankit.springbootopenapi3.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.ankit.springbootopenapi3.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Operation(summary = "Get the user details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the user", content = { @Content(mediaType = "application/json") })
    })
    @GetMapping("/")
    public ResponseEntity<User> getUser() {
        return ResponseEntity.ok(new User("mock-user"));
    }
}


package com.ramo.tokendeneme.Controllers;

import com.ramo.tokendeneme.Dtos.UserDto;
import com.ramo.tokendeneme.Dtos.UserRequest;
import com.ramo.tokendeneme.Dtos.UserResponse;

import com.ramo.tokendeneme.Services.AuthenticationService;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {
    
    private AuthenticationService authenticationService;
    
    @PostMapping("/save")
    public ResponseEntity<UserResponse> save(@RequestBody UserDto userDto){
        return ResponseEntity.ok(authenticationService.save(userDto));
    }  
    
    @PostMapping("/auth")
    public ResponseEntity<UserResponse> auth(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(authenticationService.auth(userRequest));
    }
    
    
}


package com.ramo.tokendeneme.Services;

import com.ramo.tokendeneme.Dtos.UserDto;
import com.ramo.tokendeneme.Dtos.UserRequest;
import com.ramo.tokendeneme.Dtos.UserResponse;
import com.ramo.tokendeneme.Entities.User;
import com.ramo.tokendeneme.Enums.Role;
import com.ramo.tokendeneme.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    
    private final UserRepository userRepository;
    private final JwtService jwtService;
    
    private final AuthenticationManager authenticationManager;
    
    
    public UserResponse save(UserDto userDto){
        User user = User.builder()
                .userName(userDto.getUsername())
                .password(userDto.getPassword()).
                nameSurname(userDto.getNameSurname())
                .role(Role.USER).build();
        
        userRepository.save(user);
        
        var token = jwtService.generateToken(user);
        
        return UserResponse.builder().token(token).build();
        
    }
    
    public UserResponse auth(UserRequest userRequest){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userRequest.getUsername(),userRequest.getPassword()));
        User user = userRepository.findByUsername(userRequest.getUsername()).orElseThrow();
        
        String token = jwtService.generateToken(user);
        
        return UserResponse.builder().token(token).build();
        
    }
}

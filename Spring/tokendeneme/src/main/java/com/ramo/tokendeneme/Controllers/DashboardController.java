
package com.ramo.tokendeneme.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Welcome Dashboard");
    }
}

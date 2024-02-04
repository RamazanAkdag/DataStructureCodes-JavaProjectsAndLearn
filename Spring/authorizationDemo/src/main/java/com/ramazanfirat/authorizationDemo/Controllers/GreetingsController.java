
package com.ramazanfirat.authorizationDemo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
   @GetMapping
   public ResponseEntity<String> helloWorld(){
       return ResponseEntity.ok("Hello From Our API");
   }
   
   @GetMapping("/say-good-bye")
   public ResponseEntity<String> sayGoodbye(){
       return ResponseEntity.ok("Good bye See You Later...");
   }
}

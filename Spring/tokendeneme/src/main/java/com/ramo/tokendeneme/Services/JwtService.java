
package com.ramo.tokendeneme.Services;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.function.Function;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    
    private String SECRET_KEY = "selamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselamselam";

    public String findUsername(String jwt) {
       return exportToken(jwt,Claims::getSubject);
       
    }
    
    private <T> T exportToken(String token,Function<Claims,T> claimsTFunction){
        final Claims claims = Jwts.parser().setSigningKey(getKey()).build().parseClaimsJws(token).getBody();
        return  claimsTFunction.apply(claims);
    }

    private Key getKey() {
      byte[] key = Decoders.BASE64.decode(SECRET_KEY);
      return Keys.hmacShaKeyFor(key);
    }

    public boolean tokenControl(String jwt, UserDetails userDetails) {
        final String username = findUsername(jwt);
        return (username.equals(userDetails.getUsername()) && !exportToken(jwt, Claims::getExpiration).before(new Date()));
    }

    public String generateToken(UserDetails user) {
       return Jwts.builder().setClaims(new HashMap<>()).setSubject(user.getUsername())
               .setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis() + 1000*60*24))
               .signWith(getKey(),SignatureAlgorithm.HS256).compact();
    }
    
    
}

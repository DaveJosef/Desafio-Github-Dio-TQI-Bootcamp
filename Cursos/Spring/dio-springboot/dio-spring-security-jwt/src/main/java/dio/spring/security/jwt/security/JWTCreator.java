package dio.spring.security.jwt.security;

import io.jsonwebtoken.Jwts;

public class JWTCreator {

    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";
    /*
    public static String create(String prefix, String key, JWTObject jwtObject) {
        String token = Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .setIssuedAt(jwtObject.getIssuedAt())
                .setExpiration(jwtObject.getExpiration())
                .claim(ROLES_AUTHORITIES, )
    }*/
}

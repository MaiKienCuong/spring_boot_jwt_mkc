package maikiencuong.spring_jwt_mkc.service;

import maikiencuong.spring_jwt_mkc.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
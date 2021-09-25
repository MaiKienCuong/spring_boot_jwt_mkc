package maikiencuong.spring_jwt_mkc.repository;

import maikiencuong.spring_jwt_mkc.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
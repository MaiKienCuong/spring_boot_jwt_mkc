package maikiencuong.spring_jwt_mkc.repository;

import maikiencuong.spring_jwt_mkc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
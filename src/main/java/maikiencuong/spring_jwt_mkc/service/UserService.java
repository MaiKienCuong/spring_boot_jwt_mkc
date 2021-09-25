package maikiencuong.spring_jwt_mkc.service;

import maikiencuong.spring_jwt_mkc.authen.UserPrincipal;
import maikiencuong.spring_jwt_mkc.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
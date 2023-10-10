package br.com.giulianabezerra.springbootcleanarch.infrastructure.gateways;

import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;
import br.com.giulianabezerra.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObj) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userDomainObj.email());
        userEntity.setPassword(userDomainObj.password());
        userEntity.setUsername(userDomainObj.username());
        return userEntity;
    }

}

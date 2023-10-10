package br.com.giulianabezerra.springbootcleanarch.infrastructure.gateways;

import br.com.giulianabezerra.springbootcleanarch.application.gateways.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;
import br.com.giulianabezerra.springbootcleanarch.infrastructure.persistence.UserEntity;
import br.com.giulianabezerra.springbootcleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;

    public UserRepositoryGateway(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = new UserEntityMapper().toEntity(user);

        UserEntity ue = this.userRepository.save(userEntity);

        User u = new User(ue.getUsername(), ue.getPassword(), ue.getEmail());
        return u;
    }

}

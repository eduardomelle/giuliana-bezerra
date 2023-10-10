package br.com.giulianabezerra.springbootcleanarch.application.usecases;

import br.com.giulianabezerra.springbootcleanarch.application.gateways.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {

    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return this.userGateway.createUser(user);
    }

}

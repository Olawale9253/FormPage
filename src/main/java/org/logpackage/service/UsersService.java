package org.logpackage.service;

import org.logpackage.model.UsersModel;
import org.logpackage.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String email, String password){

        if (login == null || password == null){
            return null;
        }else {
            if (usersRepository.findFirstByLogin(login).isPresent()){
                System.out.println("Duplicate Login");
                return null;
            }
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setEmail(email);
            usersModel.setPassword(password);
           return usersRepository.save(usersModel);
        }
    }

    public UsersModel authenticate(String login, String password){
        return usersRepository.findByLoginAndPassword(login, password).orElse(null);

    }
}

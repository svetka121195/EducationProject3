package app.service;

import app.model.User;

import java.util.List;


public interface UserService {

    long getUserId(String login);

    void addUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(User newUser);

    List<User> getAllUsers();
}

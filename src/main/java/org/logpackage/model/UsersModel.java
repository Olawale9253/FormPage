package org.logpackage.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "employees_table")
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String login;
    String email;
    String password;
    public UsersModel(Integer id, String login, String email, String password){
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public UsersModel() {

    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Integer getId(){
        return id;
    }
    public String getLogin(){
        return login;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModel that = (UsersModel) o;
        return Objects.equals(id, that.id) && Objects.equals(login, that.login) && Objects.equals(email, that.email) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, email, password);
    }

    @Override
    public String toString() {
        return "UsersModel{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

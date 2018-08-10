package com.dell.app;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "mybites", catalog = "")
public class UserEntity {
    private int id;
    private String userName;
    private Integer userAge;
    private String userAddress;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "userAge")
    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Basic
    @Column(name = "userAddress")
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userAge, that.userAge) &&
                Objects.equals(userAddress, that.userAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userName, userAge, userAddress);
    }
}

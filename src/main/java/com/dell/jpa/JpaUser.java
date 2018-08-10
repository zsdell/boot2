package com.dell.jpa;

import com.dell.app.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface JpaUser extends JpaRepository<UserEntity,Long>,JpaSpecificationExecutor<UserEntity>,Serializable {
}

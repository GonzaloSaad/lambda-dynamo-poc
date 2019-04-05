package com.birrete.repository;

import com.birrete.model.UserData;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface UserDataRepository extends CrudRepository<UserData, String> {
}

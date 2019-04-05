package com.birrete.function;

import com.birrete.model.UserData;
import com.birrete.model.UserDataRequest;
import com.birrete.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("userDataFunction")
public class UserDataFunction implements Function<UserDataRequest, UserData> {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public UserData apply(UserDataRequest userData) {
        return userDataRepository.findById(userData.getUsername()).orElseThrow(IllegalStateException::new);
    }
}

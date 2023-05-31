package main.java.service;

import main.java.bean.MedecineUser;

public interface MedecineUserService {

    MedecineUser findById(String username);

    int userRegister(MedecineUser medecineUser);
}

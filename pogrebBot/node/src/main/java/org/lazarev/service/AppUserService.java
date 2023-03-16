package org.lazarev.service;

import org.lazarev.entity.AppUser;

public interface AppUserService {
    String registerUser(AppUser appUser);

    String setEmail(AppUser appUser,String email);
}

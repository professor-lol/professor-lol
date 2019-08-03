package com.ccs.professorlol.security.store;

import com.ccs.professorlol.security.user.AccessUser;

public interface AccessUserManager {
     void saveUserInfo(AccessUser accessUser);
     AccessUser loadUserInfo();
}

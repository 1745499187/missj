package org.weibin.wbj.web.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by weibin on 2016/02/05.
 */
public class SecurityUtil {

    public static UserDetails getUserDetails() {
        Object obj = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(obj != null && obj instanceof UserDetails) {
            UserDetails user = (UserDetails)obj;
            return user;
        }
        else {
            return null;
        }
    }

    public static String getUsername() {
        UserDetails user = getUserDetails();
        if(user != null) {
            return user.getUsername();
        }
        else {
            return "游客";
        }
    }
}

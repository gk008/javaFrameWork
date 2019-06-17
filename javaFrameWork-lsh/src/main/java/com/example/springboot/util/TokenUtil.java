package com.example.springboot.util;

import javax.servlet.http.Cookie;

public class TokenUtil {
    public static String getLoginToken(String phoneNumber, Integer userid) {
        StringBuilder token = null;
        if (phoneNumber != null) {
            token = new StringBuilder();
            token.append(MD5Utils.encodeByMD5(phoneNumber));
            token.append(":");
            token.append(userid);
        }
        return token.toString();
    }

    private static String[] splitToken(String token) {
        String[] splits = null;
        if (token != null && "".equals(token)) {
            splits = token.split(":");
            if (splits.length == 2) {
                return splits;
            }
        }
        return null;
    }

    public static String[] getTokenFromCookies(Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("token".equals(cookie.getName())) {
                    String[] splits = splitToken(cookie.getValue());
                    return splits;
                }
            }
        }
        return null;
    }

}

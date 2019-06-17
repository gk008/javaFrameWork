package com.example.springboot.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataCheckUtil {
    public static boolean checkPhoneNumber(String phoneNumber) {
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9])|(14[5,7])|(17[0,1,3,5-8]))\\d{8}$");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    public static boolean checkNickName(String nickName) {
        if (nickName != null) {
            if (nickName.length() >= 4 && nickName.length() <= 20) {
                return true;
            }
        }
        return false;
    }
}

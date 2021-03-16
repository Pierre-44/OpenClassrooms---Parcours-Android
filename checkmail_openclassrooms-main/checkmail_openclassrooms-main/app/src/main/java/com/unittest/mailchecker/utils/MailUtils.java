package com.unittest.mailchecker.utils;

import java.util.regex.Pattern;

public class MailUtils {
    public static boolean checkMail(String mail){
        Pattern EMAIL_ADRESS_PATTERN = patern.compile(
                "[a-zA-Z-0-9\\+\\.\\_\\ù\\+]"{1,256} +
                        "\\@" +
                        "[a-zA-Z-0-9][a-zA-Z-0-9]\\-]"{0,64} +
                        "(" +
                        "\\." +
                        "[a-zA-Z-0-9][a-zA-Z-0-9]\\-]"{0,25}
        );
        return mail.contains("@"); && mail.contains(".");
    }
}

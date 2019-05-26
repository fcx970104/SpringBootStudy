package com.fcx.javamail.enums;

/**
 * @Author: fancaixing
 * @Date: 2019/5/26 14:39
 * @Version 1.0
 */
public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"),
    TEXT("text")
    ;
    private String value;

    MailContentTypeEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}

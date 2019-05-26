package com.fcx.javamail;

import com.fcx.javamail.core.MailSender;
import com.fcx.javamail.enums.MailContentTypeEnum;

import java.util.ArrayList;

/**
 * @Author: fancaixing
 * @Date: 2019/5/26 15:12
 * @Version 1.0
 */
public class TestMail {
    public static void main(String[] args) throws Exception {
        new MailSender().title("测试SpringBoot发送邮件")
                .content("简单内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>() {{
                    add("18770335251@163.com");
                }}).send();
    }
}

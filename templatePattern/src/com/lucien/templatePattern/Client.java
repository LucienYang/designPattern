package com.lucien.templatePattern;

import java.util.UUID;

/**
 * Created by Lucien on 2017/4/13.
 */
public class Client {
    public static String getRandomContent(){
        return UUID.randomUUID().toString();
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        Mail mail = new Mail(new MailTemplate());
        for(int i = 0;i<10;i++){
            Mail cloneMail = mail.clone();
            cloneMail.setSubject("mail"+i);
            cloneMail.setContent(getRandomContent());
            cloneMail.setTo("user"+i+"@163.com");
            Thread t = new Thread(new MailRunnable(cloneMail));
            t.start();
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("共耗时："+(end-start));

    }
}

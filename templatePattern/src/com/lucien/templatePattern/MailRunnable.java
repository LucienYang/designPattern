package com.lucien.templatePattern;


import java.util.UUID;

/**
 * Created by Lucien on 2017/4/13.
 */
public class MailRunnable implements Runnable {
    private Mail mail;

    public MailRunnable(Mail mail) {
        this.mail = mail;
    }


    public void sendMail(Mail mail){
        System.out.println("--------------------"+"\n"+
                "收件人："+this.mail.getTo()+"\n"+
                "发件人："+this.mail.getFrom()+"\n"+
                "主题："+this.mail.getSubject()+"\n"+
                "内容："+this.mail.getContent()+"\n"+
                "地址："+this.mail.getAddress()+"\n"+
                "--------------------");
    }
    @Override
    public void run() {
        try {
            Thread.sleep((int)(Math.random()*10000));
            sendMail(this.mail);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

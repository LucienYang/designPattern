package com.lucien.templatePattern;

/**
 * Created by Lucien on 2017/4/13.
 */
public class Mail implements Cloneable{
    private String subject;
    private String from;
    private String to;
    private String content;
    private String address;

    public Mail(MailTemplate mailTemplate) {
        this.from = mailTemplate.getFrom();
        this.address = mailTemplate.getAddress();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}

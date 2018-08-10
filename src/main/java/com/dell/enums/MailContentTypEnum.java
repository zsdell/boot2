package com.dell.enums;

public enum MailContentTypEnum {
    HTML("text/html;charset=UTF-8"), //html格式
    TEXT("text");
    private String valu;

    MailContentTypEnum(String valu) {
        this.valu = valu;
    }

    ;

    public String getValu() {
        return valu;
    }

}

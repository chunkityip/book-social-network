package com.ck.book.email;


import lombok.Getter;

public enum EmailTemplateName {

    @Getter
    ACTIVATE_ACCOUNT("activate_account")

    ;
    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}

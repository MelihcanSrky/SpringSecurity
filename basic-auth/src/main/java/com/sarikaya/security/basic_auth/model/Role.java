package com.sarikaya.security.basic_auth.model;

import org.springframework.security.core.GrantedAuthority;

// Kullanicin birden fazla rolu olsun ve bunlar customizable roller olsun diye GrantedAuthority kullaniyoruz.
public enum Role implements GrantedAuthority {
    ROLE_USER("USER"),
    ROLE_ADMIN("ADMIN"),
    ROLE_MOD("MOD");

    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String getAuthority() {
        return name();
    }
}

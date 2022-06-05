package com.colearningjava.tranquilitysuperhotel.enums;

public enum Role {
    ADMIN("Role_Admin"),
    CUSTOMER("Role_Customer"),
    GUEST_SERVICE_AGENT("Role_GuestServiceAgent");

    private final String stringValue;

    Role(String stringValue){
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

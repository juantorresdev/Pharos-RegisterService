package com.pharos.service.register.wrapper.request;

public class RecoverPasswordRequest {
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RecoverPasswordRequest{");
        sb.append("email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

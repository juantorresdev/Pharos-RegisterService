package com.pharos.service.register.wrapper.response;

public class RecoverPasswordResponse {
    
    private String status;

    private String code;

    private String validator;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RecoverPasswordResponse{");
        sb.append("status='").append(status).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", validator='").append(validator).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

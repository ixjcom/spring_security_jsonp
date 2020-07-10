package liu.cn.ixj.demo;

public enum  CoreExceptionEnum {

    SERVER_ERROR_500(500,"服务端异常"),
    SERVICE_ERRPR_EXCEPTION(501,"服务层异常"),
    ;

    private int code;

    private String message;

    CoreExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

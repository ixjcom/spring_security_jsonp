package liu.cn.ixj.exceptions;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class ServiceException extends RuntimeException {
    private String message;
    public ServiceException(String message) {
        this.message = message;
    }
}

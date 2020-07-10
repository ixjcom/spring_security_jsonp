package liu.cn.ixj.demo;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

@ControllerAdvice
@Order(10)
@ResponseBody
public class GloabError extends ExceptionHandlerExceptionResolver {


    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseData responseData(ServiceException e){
        return new ResponseData(false,CoreExceptionEnum.SERVICE_ERRPR_EXCEPTION.getCode(),CoreExceptionEnum.SERVICE_ERRPR_EXCEPTION.getMessage(),e.getMessage());

    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseData responseData(Exception e){
        return new ResponseData(false,CoreExceptionEnum.SERVER_ERROR_500.getCode(),CoreExceptionEnum.SERVER_ERROR_500.getMessage(),e.getMessage());
    }

}

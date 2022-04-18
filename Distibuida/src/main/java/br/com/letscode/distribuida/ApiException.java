package br.com.letscode.distribuida;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
@AllArgsConstructor
public class ApiException extends RuntimeException {

    private HttpStatus status;
    private String errorCode;
    private String message;

    public ApiException(String errorCode){
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.errorCode = errorCode;
        this.message = errorCode;
    }

    public ApiException(HttpStatus status, String errorCode){
        this.status = status;
        this.errorCode = errorCode;
        this.message = "" ;
    }

    public ApiException(String errorCode, String message){
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.errorCode = errorCode;
        this.message = message;
    }

}

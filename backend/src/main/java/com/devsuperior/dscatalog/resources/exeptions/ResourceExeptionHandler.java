package com.devsuperior.dscatalog.resources.exeptions;

import com.devsuperior.dscatalog.services.exeptions.EntityNotFoundExeption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExeptionHandler {

    @ExceptionHandler(EntityNotFoundExeption.class)
    public ResponseEntity<StandardError> entityNotFound(EntityNotFoundExeption e, HttpServletRequest request) {
        StandardError error= new StandardError();
        error.setTimestamp(Instant.now());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setError("Resource not found");
        error.setMessage(e.getMessage());
        error.setPath(request.getRequestURI());

        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}

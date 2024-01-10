package jade.com.backenduol.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchELementExcpetion(NoSuchElementException exception){

        ExceptionDto dto = new ExceptionDto("Essa lista não possue mais usuarios disponiveis","404" );
        return ResponseEntity.badRequest().body(dto);
    }
}

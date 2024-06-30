package easylearnenglish.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<String> handleAllUncaughtException(Exception e) {
        log.error("An error occurred: {}", e.getMessage());
        return ResponseEntity.status(500).body("An error occurred: " + e.getMessage());
    }
    
}

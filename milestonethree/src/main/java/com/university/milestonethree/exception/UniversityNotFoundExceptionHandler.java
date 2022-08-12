package com.university.milestonethree.exception;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice()
public class UniversityNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UniversityNotFoundException.class)
	public ResponseEntity<Object> handleNoSuchElementException(HttpServletRequest request, UniversityNotFoundException ex) {
		return buildExceptionResponse(
				new UniversityNotFoundResponse(HttpStatus.NOT_FOUND, LocalDateTime.now(), ex.getMessage()));
	}

	public ResponseEntity<Object> buildExceptionResponse(UniversityNotFoundResponse response) {
		return new ResponseEntity<Object>(response, response.getStatus());
	}
}
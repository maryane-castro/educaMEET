package com.educaagenda.backend.exception;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.educaagenda.backend.exception.exceptions.ConflictStoreException;
import com.educaagenda.backend.exception.exceptions.FieldException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ValidationExceptionHandler {
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErrorDTO> handleNotValid(
            MethodArgumentNotValidException exception,
            HttpServletRequest request) {
        List<ErrorDTO> errors = new ArrayList<>();
        exception
                .getBindingResult()
                .getAllErrors()
                .forEach(error -> {
                    errors.add(new ErrorDTO(
                            Instant.now(),
                            HttpStatus.BAD_REQUEST.value(),
                            ((FieldError) error).getField(),
                            error.getDefaultMessage(),
                            request.getRequestURI()));
                });
        return errors;
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoSuchElementException.class)
    public ErrorDTO handleNoSuchElementException(
            NoSuchElementException exception,
            HttpServletRequest request) {

        System.out.println(exception.getClass());
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setTimestamp(Instant.now());
        errorDTO.setStatus(HttpStatus.NOT_FOUND.value());
        errorDTO.setError("not found!");
        errorDTO.setMessage(exception.getMessage());
        errorDTO.setPath(request.getRequestURI());
        return errorDTO;
    }

    @ResponseStatus(code = HttpStatus.CONFLICT)
    @ExceptionHandler(FieldException.class)
    public ErrorDTO handleFieldException(
            FieldException exception,
            HttpServletRequest request) {

        System.out.println(exception.getClass());
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setTimestamp(Instant.now());
        errorDTO.setStatus(HttpStatus.CONFLICT.value());
        errorDTO.setError("invalid field");
        errorDTO.setMessage(exception.getMessage());
        errorDTO.setPath(request.getRequestURI());
        return errorDTO;
    }

    @ResponseStatus(code = HttpStatus.CONFLICT)
    @ExceptionHandler(ConflictStoreException.class)
    public ErrorDTO handleConflictStoreException(
            ConflictStoreException exception,
            HttpServletRequest request) {

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setTimestamp(Instant.now());
        errorDTO.setStatus(HttpStatus.CONFLICT.value());
        errorDTO.setError("conflict");
        errorDTO.setMessage(exception.getMessage());
        errorDTO.setPath(request.getRequestURI());
        return errorDTO;
    }
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ErrorDTO handleDataIntegrityViolationException(
            DataIntegrityViolationException exception,
            HttpServletRequest request) {

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setTimestamp(Instant.now());
        errorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorDTO.setError("internal error");
        errorDTO.setMessage(exception.getCause().getMessage());
        errorDTO.setPath(request.getRequestURI());
        return errorDTO;
    }

    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorDTO handleException(
            Exception exception,
            HttpServletRequest request) {

        System.out.println(exception.getClass());
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setTimestamp(Instant.now());
        errorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorDTO.setError("internal error");
        errorDTO.setMessage(exception.getMessage());
        errorDTO.setPath(request.getRequestURI());
        return errorDTO;
    }
}

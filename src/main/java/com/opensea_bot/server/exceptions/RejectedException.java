package com.opensea_bot.server.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class RejectedException extends Exception{
    public RejectedException(String message) {
        super(message);
    }
}

package com.moneysupermarket.milestone3.ErrorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Profile not found")
public class ProfileNotFoundException extends RuntimeException{
}

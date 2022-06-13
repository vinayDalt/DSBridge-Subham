package com.subham.dataScienceBridge.exception;

//@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Category already exists on server")
public class CategoryAlreadyExists extends Exception{
    private String message;

    public CategoryAlreadyExists()
    {}

    public CategoryAlreadyExists(String message){

        super(message);
        this.message=message;

    }
}

package com.subham.dataScienceBridge.exception;

public class CategoryDoesNotExists extends Exception{

    private String message;

    public CategoryDoesNotExists()
    {}

    public CategoryDoesNotExists(String message){

        super(message);
        this.message=message;

    }
}

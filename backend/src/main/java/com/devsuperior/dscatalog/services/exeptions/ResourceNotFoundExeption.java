package com.devsuperior.dscatalog.services.exeptions;

public class ResourceNotFoundExeption extends RuntimeException{
    private static final long serialVersioUID = 1L;

    public ResourceNotFoundExeption(String msg) {
        super(msg);
    }
}

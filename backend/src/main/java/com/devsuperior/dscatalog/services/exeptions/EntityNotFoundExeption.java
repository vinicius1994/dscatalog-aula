package com.devsuperior.dscatalog.services.exeptions;

public class EntityNotFoundExeption extends RuntimeException{
    private static final long serialVersioUID = 1L;

    public EntityNotFoundExeption (String msg) {
        super(msg);
    }
}

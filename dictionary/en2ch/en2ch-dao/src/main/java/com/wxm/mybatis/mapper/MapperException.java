package com.wxm.mybatis.mapper;

public class MapperException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 3016312293873826171L;

    public MapperException() {
        super();
    }

    public MapperException(String message) {
        super(message);
    }

    public MapperException(String message, Throwable cause) {
        super(message, cause);
    }

    public MapperException(Throwable cause) {
        super(cause);
    }

}

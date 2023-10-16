package project.exception;

import java.io.Serializable;

public class DbException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 123456789L;

    public DbException(String message) {
        super(message);
    }

    public DbException(Throwable cause) {
        super(cause);
    }

    public DbException(String message, Throwable cause) {
        super(message, cause);
    }
}

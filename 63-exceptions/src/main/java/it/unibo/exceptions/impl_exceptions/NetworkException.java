package it.unibo.exceptions.impl_exceptions;

import java.io.IOException;

public class NetworkException extends IOException {
    public NetworkException() {
        System.out.println("Network error: no response");
    }

    public NetworkException(final String message) {
        System.out.println("Network error while sending message: " + message);
    }
}

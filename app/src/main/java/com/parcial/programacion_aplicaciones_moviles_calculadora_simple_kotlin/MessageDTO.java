package com.parcial.programacion_aplicaciones_moviles_calculadora_simple_kotlin;

import java.io.Serializable;

public class MessageDTO implements Serializable {
    private final String message;

    public MessageDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDeDuracionExeption extends RuntimeException {

    public ErrorEnConversionDeDuracionExeption(String mensaje) {
        super(mensaje); // Pasa el mensaje al constructor de RuntimeException
    }

    // No necesitas sobreescribir getMessage(), ya está definido en RuntimeException
}

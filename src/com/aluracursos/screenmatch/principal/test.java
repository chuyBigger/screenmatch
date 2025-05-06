package com.aluracursos.screenmatch.principal;

import java.io.FileWriter;

public class test {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("archivo");

            writer.write("Hello");
            writer.close();
            writer.write(" World!");
            writer.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}

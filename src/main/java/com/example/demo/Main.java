package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;

import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void lecturaFichero()throws IOException{ // excepcion usando java.IO
        try{
        Path file = Path.of("demo\\carpetaEjemplo\\file.txt"); // ruta al fichero
        String content = Files.readString(file); // el contenido del fichero a String con el método readString
        System.out.println(content); // imprime el contenido 
        }catch(IOException e){
            System.out.println("El archivo no ha sido encontrado");
        }
    }
}
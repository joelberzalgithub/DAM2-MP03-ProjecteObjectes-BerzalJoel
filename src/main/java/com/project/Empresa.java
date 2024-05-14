package com.project;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static void main(String[] args) {
        // Creem instàncies de Desenvolupador i Gestor
        List<Empleat> empleats = new ArrayList<>();
        empleats.add(new Desenvolupador("Anna", "DEV001", "Java"));
        empleats.add(new Gestor("Carlos", "MAN001", "TI"));
        empleats.add(new Desenvolupador("Berta", "DEV002", "C#"));

        // Iterem sobre els empleats i mostrem la seva informació
        for (Empleat empleat : empleats) {
            // Fem el casting descendent per accedir a propietats específiques de Desenvolupador i Gestor
            if (empleat instanceof Desenvolupador) {
                Desenvolupador desenvolupador = (Desenvolupador) empleat;
                System.out.println(desenvolupador.toString());
            } else if (empleat instanceof Gestor) {
                Gestor gestor = (Gestor) empleat;
                System.out.println(gestor.toString());
            }
        }
    }
}

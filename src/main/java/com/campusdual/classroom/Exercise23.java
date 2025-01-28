package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        //creamos una coleccion de tipo map inicializada como hashmap
        Map<String, Person> customMap = new HashMap<>();

        //anadimos las entradas
        customMap.put("person", new Person("John", "Smith"));
        customMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        customMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        customMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return customMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {

            map.put(key, value);
                System.out.println("Nuevo valor añadido.");
             return map.get(key);
    }


    public static void printMapValues(Map<String, Person> map) {
        //muestra los valores por consola
        map.forEach((clave, valor)->{
            valor.getDetails();
        });

    }

    public static void main(String[] args) {

    //creamos una nueva coleccion de mapa llamando al metodo correspondiente
    Map<String, Person> customMap = createHashMap();

    //nuevo elemento para el mapa
     addMapValue(customMap, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));

    //mostramos por consola los valores
    printMapValues(customMap);

    }
}

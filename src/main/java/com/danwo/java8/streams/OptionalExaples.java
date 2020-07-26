package com.danwo.java8.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExaples {
    //java 8 wprowadziala Optional czyli opakowanie na obiekt gdzie w srodku moze byc lub jest pusto

    public static void main(String[] args) {
        Human human = new Human("Jan", "Kowalski", 35);

        Optional<Human> humanOptional = Optional.empty(); //pusty kontener na obiekt
        Optional<Human> humanOptional1 = Optional.of(human); //kontener tworzony na niepustym obiekcie, jak obiekt jest null to ponizsze rzuci wyjatkiem Null Pointer Exception
        Optional<Human> humanOptional2 = Optional.ofNullable(human); //kontener tworzony na (byc moze pustym) obiekcie, jak obiekt jest null to tez ok, nie bedzie NPE

        if (human == null){
            ///
        }
        //czyli w optionalu jest jakas zawartosc (obiekt klasy human)
        if(humanOptional.isPresent()){
            System.out.println("obiekt niepusty, pobieram");
            humanOptional.get();
        }else {
            System.out.println("obiekt pusty, nie ma co pobierac");
        }
        //Array vs LinkedList, dodawanie nowych elementow na koncu listy, dodawanie nowych elementow w dowolnym miejscu listy
        List<Human> humanList = new LinkedList<>();
        humanList.add(human);
        humanList.add(human);
        humanList.add(human);
        humanList.add(human);

        System.out.println("co znalezlismy: ");
        String found = humanList.stream()
                .filter(el -> "Jan".equalsIgnoreCase(el.getName()))
                .findFirst() //optional od Human
                .map(x -> x.getName())
                .orElse("Nikt");
        System.out.println(found);

        System.out.println("Jan czy Anna");
        Human foundButGetElse = humanList.stream()
                .filter(el -> "Jaś".equalsIgnoreCase(el.getName()))
                .findFirst() //optional od Human
                .orElse(getDefoultHuman("Anna", "German", 44));
        System.out.println(foundButGetElse);

        System.out.println("Jan czy Anna vol2");
        Human foundElseGet = humanList.stream()
                .filter(el -> "Jan".equalsIgnoreCase(el.getName()))
                .findFirst() //optional od Human
                .orElseGet(() -> getDefoultHuman("Anna", "German", 44));
        System.out.println(foundElseGet);

    }

    private static Human getDefoultHuman(String name, String surname, int age) {
        System.out.println("adding default human");
        return new Human(name, surname, age);
    }
}

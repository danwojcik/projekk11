package com.danwo.java8.streams;

import com.danwo.coellections.Car;
import com.danwo.coellections.compering.CarComparedByEngine;
import com.danwo.testing.encapsulation.person.People;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//zasada dzialania strumieni jest PANTHA REI
//generowanie strumienia:
//- metoda stream() na kolekjcach
//- metoda of(elements) na elementach wyliczonych
//- Arrays.stream(Object[]) - trumien na elementach tabeli
//metody posrednie:
//- map - przeksztalcenie /wykonanie dzialania
//- flatMap - splaszczanie z kilku strumieni do jednego
//- filter - filtrowanie po zadanych kryteriach
// - filtrowanie po zadanych kryteriach
// - limit - max ilosc elementow zwracanych
// - distinct - przechodza tylko alementy niepowtarzalne
// metody konczące:
//- toArray - zwraca tabele
//- collect zwraca "cos" - to moze byc kolekcja, moze byc pojedynca wartosc
//- reduce - zwraca jedna wartosc
//- count zwraca ilosc elementow
//- max zwraca wartos max wg zadanych kryteriow
//- findFirst - zwraca Optional <costam>
//- findAny - zwraca Optional<costam>

public class StreamExamples {
    public static void main(String[] args) {

        //DTO - data transfer object
        //uzywany do przekazywania danych obiektu do pliku, przez siec, itp.
        class HumanDTO {
            String name;
            String surname;

            public HumanDTO(String name, String surname) {
                this.name = name;
                this.surname = surname;
            }
        }

        List<Human> people = new LinkedList<>();
        people.add(new Human("Jan", "Kowalski", 22));
        people.add(new Human("Marian", "Nowak", 33));
        people.add(new Human("Paweł", "Wiewiór", 55));
        people.add(new Human("Anna", "Jalewska", 25));

        //wypisac wszystkich ludzi na ekran
        System.out.println("======Traditional way======");
        for (Human person : people) {
            System.out.println(person);
        }
        System.out.println("======stream way=====");
        people.stream().forEach(x -> System.out.println(x));
        //stream
        //1 - operacja generujaca strumien np.metoda stream()
        //2 - operacje posrednie - wykonujace jaies przeksztalcenia
        //3 - operacje konczace - zwracajace wartosc albo void
        people.stream() //stream() powoluje strumien obiektow z elementow listy people
                .forEach(x -> System.out.println(x)); //operacja konczaca, wypisujaca elementy na ekran
        //wypisac na ekran jesli wiek osoby powyzej 20
        System.out.println("======filter old way======");
        for (Human person : people) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }
        //filter whit java 8 stream
        System.out.println("======filter new way======");
        people.stream()
                .filter(x -> x.getAge() > 30) //metoda posrednia
                .forEach(System.out::println); //konczenie strumienia

        //first two elements
        System.out.println("======limit two first elements======");
        people.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("=====limit 2 and filter under 30=======");
        people.stream()
                .limit(2)
                .filter(x -> x.getAge() > 30)
                .forEach(System.out::println);

        System.out.println("=====print names=======");
        people.stream()
                .map(x -> x.getName()) //przeksztalcamy strumien Human na strumien String bo map() zwraca obiety zwracane przez wywowalna operacje (u nas getName)
                .forEach(System.out::println);

        System.out.println("=====map to another object=======");
        List<HumanDTO> listDTOs = people.stream()
                //dla kazdego elementu strumienia map wola konstruktor klasy HumanDTO, przekazujac dane z aktualnego elementu strumienia
                .map(x -> new HumanDTO(x.getName(), x.getSurname()))
                .collect(Collectors.toList());

        listDTOs.forEach(x -> System.out.println(x.name + " " + x.surname));

        System.out.println("=====laczenie strumieni=======");
        //laczenie kilku kolekcji i wykonanie operacji na ich elementach
        Set<Human> peopleset = new HashSet<>();
        peopleset.add(new Human("Anna", "Wilkowska", 18));
        peopleset.add(new Human("Piotr", "Bania", 33));
        peopleset.add(new Human("Agata", "Ruwier", 45));
        peopleset.add(new Human("Karolina", "Inglot", 11));

        List<Human> humanConcat = Stream.of(people, peopleset) //of() sklada strumien z podanych kolekcji
                //flatmap przeksztalca zlozona strukture w prostsza (jednowymiarowa)
                //z strumenia dwoch kolekcji robi jeden strumien
                //z wszystkich elementow obu kolekcji
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        humanConcat.forEach(System.out::println);

        System.out.println("=====wydruk wspolny imie + wiek=======");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .forEach(el -> System.out.println((el.getName() + " " + el.getAge())));

        System.out.println("=====ludzie z przedzialu 23-40=======");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .filter(x -> x.getAge() < 40)
                .filter(x -> x.getAge() > 23)
                .forEach(System.out::println);

        System.out.println("============");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList())
                //po collect powyzszy strumien sie konczy i jak chcemy robic cos strumieniowo dalej
                //to znowu wolamy stream() i teraz odnosi sie to do listy wyplutego przez .collect
                .stream()
                .filter(x -> x.getAge() > 30)
                .map(el -> el.getSurname())
                .filter(a -> a.length() > 6)
                .forEach(System.out::println);

        System.out.println("=====sortowanie w strumieniu=======");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .sorted() //uzywamy komparatora z klasy Human z comparable
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=====sortowanie z zwenetrznym komparatorem=======");
        Stream.of(people, peopleset)
                .flatMap(aa -> aa.stream())
                .sorted(new HumanComparedByNameAndAge())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=====ilosc tal wszystkich razem=======");
        //po staremu
        int oldWaySum = 0;
        for (Human person : people) {
            oldWaySum += person.getAge();
        }
        System.out.println("old way sum = " + oldWaySum);

        int ageSum = people.stream()
                .map(a -> a.getAge())
                .reduce(0, (sumaczesciowa, el) -> sumaczesciowa + el);
        System.out.println("age sum = " + ageSum);

        System.out.println("======laczenie stringow======");
        String namesJoined = people.stream()
                //przy wywowalaniu przez referencje (::) odnosimy sie do klasy a nie do elementu strumienia
                .map(Human::getSurname)
                .collect(Collectors.joining());
        System.out.println("names joined " + namesJoined);

        System.out.println("============");
        String namesJoinedWithComma = people.stream()
                //przy wywowalaniu przez referencje (::) odnosimy sie do klasy a nie do elementu strumienia
                .map(Human::getSurname)
                .collect(Collectors.joining(", "));
        System.out.println("names joined " + namesJoinedWithComma);

        String namesJoinedWithCommaInBrackets = people.stream()
                //przy wywowalaniu przez referencje (::) odnosimy sie do klasy a nie do elementu strumienia
                .map(Human::getSurname)
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println("names joined " + namesJoinedWithCommaInBrackets);

        System.out.println("======najwyzsza wartosc (wiek)======");
        Optional<Integer> maxAge = peopleset.stream()
                .map(Human::getAge)
                .max(Integer::compareTo);
        System.out.println(maxAge.isPresent() ? "max wiek " + maxAge : "nie znaleziono");

        System.out.println("=====full name print=======");
        people.stream()
                .map(x -> x.getName() + " " + x.getSurname())
                .forEach(System.out::println);

        System.out.println("======function info======");
        Object[] peopleArray = people.stream()
                .map(StreamExamples::returnHumanInfo)
                .toArray();
        for (Object o : peopleArray){
            System.out.println(o);
        }

        System.out.println("============");

        }
        private static String returnHumanInfo(Human human){
        return human.getSurname() + " " + human.getName() + " " + human.getAge();
        }
    }
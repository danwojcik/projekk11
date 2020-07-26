package com.danwo.innerClasses.localClass;

public class LocalClassTest {
    public static void main(String[] args) {

        class LocalPerson {
            private String personName;

            public LocalPerson(String personName) {
                this.personName = personName;
            }

            public String getPersonName() {
                return personName;
            }
        }
        LocalPerson person = new LocalPerson("Jan Kowalski");

        System.out.println(person.getPersonName());
    }
}

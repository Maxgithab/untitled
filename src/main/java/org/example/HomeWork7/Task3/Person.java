package org.example.HomeWork7.Task3;

class Person implements Cloneable {
    String name;
    int age;

    public Person clone() {
        try {
            return (Person) super.clone(); // ← 3. Вызвал super.clone()
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return name + " (" + age + " лет)";
    }
}

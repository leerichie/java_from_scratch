package org.example.person;

public class Person {

    private String name;
    private String surname;
    private int age;
    private long id;
    private Gender gender;

    public enum Gender{
        MALE,
        FEMALE;
    }

    boolean hasReachedRetirement(){
        return gender == Gender.FEMALE && age >= 60 || gender == Gender.MALE && age >= 65;
//        return yearsLeftTilRetirement() == 0;
    }
    
    int ageDifference(String name1, String name2, int age1, int age2) {
        int result =0;
        if (age1 > age2) {
            System.out.println(name1 + " is older than " + name2 + " by " + (result = age1 - age2) + " years");
        } else if (age2 > age1) {
            System.out.println(name2 + " is older than " + name1 + " by " + (result = age2 - age1) + " years");
        } else
            System.out.println(name1 + " and " + name2 + " are the same age");
        return result;

//    int ageDifference (Person anotherPerson){
//        return Math.abs(age - anotherPerson.age);

    }

    int yearsLeftTilRetirement(){
        if (gender.equals(Gender.MALE) && age < 65){
            System.out.println(name + ", time left til retirement: " + (age = 65 - age) + " years");
            return age >= 60 ? 0 : 60 - age;
        } else if (gender.equals(Gender.FEMALE) && age < 60){
            System.out.println(name + ", time left til retirement " + (age = 60 - age) + " years");
            return age >= 65 ? 0 : 65 - age;
        }
        throw new UnsupportedOperationException();
    }

    public Person() {
    }

    public Person(String name, String surname, Gender gender, int age, long id) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

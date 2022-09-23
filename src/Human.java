import java.awt.*;
import java.awt.print.Pageable;

public class Human {

    private int age;
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;



    public Human (int age, String name, String town, String job) {
        int currentYear = 2022;
        this.age = age;
        this.yearOfBirth = currentYear - age;
        this.name = name;
        this.town = town;
        this.job = job;
    }
    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Мой год рождения - " +
                this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!";
    }


    }


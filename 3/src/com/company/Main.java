package com.company;

import entity.Developer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        System.out.println("Enter name of developer ");
        Scanner fio = new Scanner(System.in);
        developer.setFio(fio.nextLine());
        System.out.println("Enter date, when you got a task");
        Scanner achiveTask = new Scanner(System.in);
        developer.setAchiveTaskDate(achiveTask.nextLine());
        System.out.println(developer);
    }
}
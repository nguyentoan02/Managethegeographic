/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author MSII
 */
import controller.Manager;
import validate.Validation;

public class Main {

    public static void main(String[] args) {
        Validation validator = new Validation();
        Manager manager = new Manager(validator);

        System.out.println("Welcome to the East Asia Country Management System!");

        while (true) {
            manager.run();
        }
    }
}

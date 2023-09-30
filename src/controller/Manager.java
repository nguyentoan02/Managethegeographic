/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSII
 */
package controller;

import model.Country;
import validate.Validation;
import view.Menu;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Menu<String> {

    private final List<Country> countries;
    private final Validation validator;

    public Manager(Validation validator) {
        super("Menu", new String[]{
            "Add Country Information",
            "Display Entered Information",
            "Search Information by Name",
            "Sort Information by Name Ascending",
            "Exit"
        });
        this.countries = new ArrayList<>();
        this.validator = validator;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                // Add Country Information
                System.out.println("Enter country information:");
                validator.inputCountry((ArrayList<Country>) countries);
                System.out.println("Country information added successfully.");
                break;
            case 2:
                // Display Entered Information
                System.out.println("Displaying entered information:");
                validator.printCountry((ArrayList<Country>) countries);
                break;
            case 3:
                // Search Information by Name
                System.out.print("Enter the name you want to search for: ");
                String countryName = validator.checkInputString();
                System.out.println("Searching for countries with the name: " + countryName);
                validator.searchByName((ArrayList<Country>) countries);
                break;
            case 4:
                // Sort Information by Name Ascending
                System.out.println("Sorting information by name in ascending order:");
                validator.printCountrySorted((ArrayList<Country>) countries);
                break;
            case 5:
                // Exit
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }
}



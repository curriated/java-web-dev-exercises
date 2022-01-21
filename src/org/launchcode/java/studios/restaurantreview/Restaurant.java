package org.launchcode.java.studios.restaurantreview;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();
        MenuItem newItem1 = new MenuItem("Bore-gur", "a very boring burger",6.99,"main",true,new Date());

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu launchMenu = new Menu(today, startingMenu);

        launchMenu.addItem(newItem1);
        launchMenu.printMenu();
    }
}

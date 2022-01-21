package org.launchcode.java.studios.RestaurantMenu.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList menu = new ArrayList<>();
    private Date lastUpdated;

    public Menu(ArrayList menu, Date lastUpdated) {
        this.menu = menu;
        this.lastUpdated = lastUpdated;
    }

    public static void addMenuItem(MenuItem aMenuItem){
        menu.add(aMenuItem);
    }

    public static void removeMenuItem(MenuItem aMenuItem){
        if(menu.contains(aMenuItem)){
            menu.remove(aMenuItem);
        } else {
            System.out.println("This menu item does not exist");
        }

    }

    public static ArrayList printMenu(Menu aMenu){
        return aMenu.getMenu();
    }

    public static String lastUpdated(Menu aMenu){
        return aMenu.lastUpdated;
    }

    // getters and setters:
    public ArrayList getMenu() {
        return menu;
    }

    public void setMenu(ArrayList menu) {
        this.menu = menu;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

package com.warehousemanagementsystem;

public class Main {

    public static void main(String[] args) {
        // creating object of storage class to initialize the list
        Storage storage = new Storage();

        // electronic item created
        Electronics electronics = new Electronics(101, "Monitor", 20000);
        // electronic item added
        storage.addItem(electronics);

        // grocery item created
        Groceries groceries = new Groceries(102, "Bread", 45);
        // grocery item added
        storage.addItem(groceries);

        // furniture item created
        Furniture furniture = new Furniture(103, "Table", 5000);
        // furniture item added
        storage.addItem(furniture);

        // display detail from WarehouseItems using static method
        WarehouseItems.displayDetails(storage.getStorage());
    }
}

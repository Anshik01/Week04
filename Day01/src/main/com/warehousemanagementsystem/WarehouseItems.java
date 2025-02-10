package com.warehousemanagementsystem;

import java.util.List;

// using to generics to generalize
public abstract class WarehouseItems<T> {
    T itemID;
    T itemName;
    T price;

    public WarehouseItems(T itemID, T itemName, T price){
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
    }

    // using wildcard in generics
    public static void displayDetails(List<? extends WarehouseItems> items){

        for (WarehouseItems item: items) {

            System.out.println("Item ID : " + item.itemID);
            System.out.println("Item name : " + item.itemName);
            System.out.println("Item price : " + item.price);
            System.out.println();
        }

    }
}

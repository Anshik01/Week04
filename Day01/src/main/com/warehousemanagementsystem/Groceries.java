package com.warehousemanagementsystem;

public class Groceries<T> extends WarehouseItems{

    T itemID;
    T itemName;
    T price;

    // calling super class constructor
    public Groceries(T itemID, T itemName, T price){
        super(itemID, itemName, price);
    }
}

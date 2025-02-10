package com.warehousemanagementsystem;

public class Furniture<T> extends WarehouseItems{

    T itemID;
    T itemName;
    T price;

    // calling super class constructor
    public Furniture(T itemID, T itemName, T price){
        super(itemID, itemName, price);
    }

}

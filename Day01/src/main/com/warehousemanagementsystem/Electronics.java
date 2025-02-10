package com.warehousemanagementsystem;

public class Electronics <T> extends WarehouseItems {
    T itemID;
    T itemName;
    T price;

    // calling super class constructor
    public Electronics(T itemID, T itemName, T price){
        super(itemID, itemName, price);
    }

}

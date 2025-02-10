package com.warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItems> {
    List<WarehouseItems> storage;

    public Storage(){
        // initialize arrayList when object is created
        storage = new ArrayList<>();
    }

    // adding items in the List
    public void addItem(WarehouseItems item){
        storage.add(item);
    }

    // return the list to display items
    public List<WarehouseItems> getStorage(){
        return storage;
    }
}

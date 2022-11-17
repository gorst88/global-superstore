package com.ltp.globalsuperstore.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltp.globalsuperstore.Item;

@Repository
public class StoreRepository {
    private List<Item> storeItems = new ArrayList<>();

    public void addItem(Item item) {
        storeItems.add(item);
    }

    public Item getItem(int index) {
        return storeItems.get(index);
    }

    public List<Item> getItems() {
        return storeItems;
    }

    public void updateItem(Item item, int index) {
        storeItems.set(index, item);
    }

}

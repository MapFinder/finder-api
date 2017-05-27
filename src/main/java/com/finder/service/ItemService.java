package com.finder.service;

import com.finder.model.Item;
import java.util.List;

public interface ItemService {

    Item findById(Long id);

    Item findByDescription(String description);

    void saveItem(Item item);

    void updateItem(Item item);

    void deleteItemById(Long id);

    void deleteAllItems();

    List<Item> findAllItems();

    boolean isItemExist(Item item);
}

package com.finder.service;

import java.util.List;

import com.finder.model.Item;
import com.finder.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    public Item findById(Long id) {
        return itemRepository.findOne(id);
    }

    public Item findByDescription(String description) {
        return itemRepository.findByDescription(description);
    }

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public void updateItem(Item item){
        saveItem(item);
    }

    public void deleteItemById(Long id){
        itemRepository.delete(id);
    }

    public void deleteAllItems(){
        itemRepository.deleteAll();
    }

    public List<Item> findAllItems(){
        return itemRepository.findAll();
    }

    public boolean isItemExist(Item item) {
        return findByDescription(item.getDescription()) != null;
    }

}

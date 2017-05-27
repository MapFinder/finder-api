package com.finder.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.finder.model.Item;
import com.finder.service.ItemService;
import com.finder.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class ItemsController {

    public static final Logger logger = LoggerFactory.getLogger(ItemsController.class);

    @Autowired
    ItemService itemService; //Service which will do all data retrieval/manipulation work

    // -------------------Retrieve All Items---------------------------------------------

    @RequestMapping(value = "/item/", method = RequestMethod.GET)
    public ResponseEntity<List<Item>> listAllItems() {
        List<Item> items = itemService.findAllItems();
        return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
    }

    // -------------------Create an Item-------------------------------------------

    @RequestMapping(value = "/item/", method = RequestMethod.POST)
    public ResponseEntity<?> createItem(@RequestBody Item item, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Item : {}", item);

        itemService.saveItem(item);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/item/{id}").buildAndExpand(item.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
}

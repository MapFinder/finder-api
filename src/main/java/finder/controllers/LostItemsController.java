package finder.controllers;

import finder.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;


@Controller
@CrossOrigin
public class LostItemsController {
    @RequestMapping("/lost-items")
    public @ResponseBody Item getLostItems() {
        Item item = new Item("Some description");

        return item;
    }
}

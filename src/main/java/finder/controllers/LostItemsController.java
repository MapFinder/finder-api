package finder.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class LostItemsController {

    @RequestMapping("/lost-items")
    @ResponseBody
    public ResponseEntity getLostItems() {
        return new ResponseEntity("{ items: [] }", HttpStatus.OK);
    }
}

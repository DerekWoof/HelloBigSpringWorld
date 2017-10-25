package MyFirstSpringController.adapter.rest;

import MyFirstSpringController.domain.view.TwitterView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")

public class TwitterController {


    @GetMapping
    public List<TwitterView> getTwitters(@RequestParam("packetNumber")Integer packetNumber){

    }

}

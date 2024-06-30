package easylearnenglish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/word")
@Controller
public class WordController {

    @GetMapping("/not-learned")
    public String getNotLearnedWords() {
        return "not learned words";
    }
}

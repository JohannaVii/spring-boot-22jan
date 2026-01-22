package se.iths.johanna.springboot22jan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.johanna.springboot22jan.model.Person;

import java.util.List;

@Controller
public class PersonController {

    @GetMapping("/persons")
    public String personlist(Model model) {

        List<Person> persons = List.of(
                new Person(1, "Martin Grütlock", 19, "mr.grutlock@yahoo.com"),
                new Person(2, "Martin Grütlappar", 21, "grutlappen02@hotmail.com"),
                new Person(3, "Martin Grütünderlägg", 15, "grytis18264@spray.se")
        );

        model.addAttribute("persons", persons);

        return "persons";
    }
}

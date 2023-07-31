//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.superheroes.controller;

import com.example.superheroes.model.Hero;
import com.example.superheroes.service.HeroService;
import javax.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"http://localhost:3000"}
)
public class HeroController {
    @Autowired
    HeroService heroService;

    public HeroController() {
    }

    @GetMapping({"/heroes"})
    public List<Hero> getAllHeroes() {
        return this.heroService.getAllHeroes();
    }

    @GetMapping({"/heroes/{letter}"})
    public List<Hero> getHeroesStartingWithLetter(@PathVariable String letter) {
        return this.heroService.getHeroesStartingWithLetter(letter);
    }

   // @PostMapping({"/heroes"})
    //public HttpStatus saveNewHero(@RequestBody @Valid Hero hero) {
       // Hero result = this.heroService.saveHero(hero);
       // return result == null ? HttpStatus.PRECONDITION_FAILED : HttpStatus.CREATED;
    }


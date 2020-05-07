package com.kimjiyeung.app.controller;
import com.kimjiyeung.app.entity.*;
import com.kimjiyeung.app.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private PersonRepository personRepository;
    private SocialMediaRepository socialMediaRepository;
    private InterestsRepository interestsRepository;
    private SkillRepository skillRepository;
    private WorkRepository workRepository;

    public IndexController(PersonRepository personRepository,SocialMediaRepository socialMediaRepository,InterestsRepository interestsRepository,SkillRepository skillRepository,WorkRepository workRepository) {

        this.personRepository = personRepository;
        this.socialMediaRepository= socialMediaRepository;
        this.interestsRepository= interestsRepository;
        this.skillRepository= skillRepository;
        this.workRepository= workRepository;
    }


    @GetMapping("/")
    public String index(Model model) {
        Person person = personRepository.findAll().stream().findFirst().orElse(null);
        model.addAttribute("person", person);

        SocialMedia socialMedia = socialMediaRepository.findAll().stream().findFirst().orElse(null);
        model.addAttribute("socialMedia", socialMedia);

        List<Interests> interests = interestsRepository.findAll();
        model.addAttribute("interests", interests);

        List<Skill> skills = skillRepository.findAll();
        model.addAttribute("skills", skills);

        List<Work> works = workRepository.findAll();
        model.addAttribute("works", works);

        return "resume";
    }
}
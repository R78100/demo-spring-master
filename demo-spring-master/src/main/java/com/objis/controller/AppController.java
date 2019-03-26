package com.objis.controller;


import com.objis.service.FormationService;
import com.objis.spring.demodomaine.Formation;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
public class AppController {

    @Autowired
    private FormationService formationService;

    @RequestMapping({"/", "/index"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("formationList", this.formationService.list());
        return modelAndView;
    }

    @RequestMapping("/form")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("form");
        return modelAndView;
    }

    @PostMapping(path = "/form")
    public String validateForm(String theme) {
        Formation formation = new Formation(null, theme);
        this.formationService.save(formation);
        return "redirect:/index.html";
    }

    @GetMapping(path = "/delete")
    public String delete(Integer id) {
        this.formationService.delete(id);
        return "redirect:/index.html";
    }

    @RequestMapping("/edit")
    public ModelAndView edit(Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        Formation formation = this.formationService.find(id);
        Hibernate.initialize(formation);
        modelAndView.addObject("formation", formation);
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @PostMapping(path = "/edit")
    public String validateChanges(Integer id, String theme) {
        Formation formation = new Formation(id, theme);
        this.formationService.save(formation);
        return "redirect:/index.html";
    }
}

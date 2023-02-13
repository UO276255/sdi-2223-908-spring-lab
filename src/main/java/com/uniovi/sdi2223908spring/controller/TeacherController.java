package com.uniovi.sdi2223908spring.controller;

import com.uniovi.sdi2223908spring.entities.Teacher;
import com.uniovi.sdi2223908spring.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService tchService;


    @RequestMapping(value = "/teacher/add", method = RequestMethod.POST)
    public String setTeacher(@ModelAttribute Teacher teacher) {
        tchService.addTeacher(teacher);
        return "redirect:/teacher/list";
    }

    @RequestMapping(value = "/teacher/add")
    public String getTeacher() {
        return "teacher/add";
    }

    @RequestMapping("/teacher/list")
    public String getList(Model model) {
        model.addAttribute("teacherList",tchService.getList());
        return "teacher/list";
    }

    @RequestMapping("/teacher/details/{id}")
    public String getDetails(Model model,@PathVariable Long id) {
        model.addAttribute("teacher",tchService.getTeacher(id));
        return "teacher/details";
    }

    @RequestMapping(value ="/teacher/delete/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        tchService.deleteTeacher(id);
        return "redirect:/teacher/list";
    }

    @RequestMapping(value ="/teacher/edit{id}",method=RequestMethod.POST)
    public String editTeacher(@PathVariable Long id) {
        tchService.editTeacher(id);
        return "Edited";
    }

    @RequestMapping(value = "/teacher/edit/{id}")
    public String getEdit(Model model, @PathVariable Long id) {
        model.addAttribute("teacher", tchService.getTeacher(id));
        return "teacher/edit";
    }

}

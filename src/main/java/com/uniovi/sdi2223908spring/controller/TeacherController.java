package com.uniovi.sdi2223908spring.controller;

import com.uniovi.sdi2223908spring.entities.Teacher;
import com.uniovi.sdi2223908spring.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService tchService;


    @RequestMapping(value = "/teacher/add", method = RequestMethod.POST)
    public String setTeacher(@ModelAttribute Teacher teacher) {
        tchService.addTeacher(teacher);
        return "Added";
    }

    @RequestMapping(value = "/teacher/add")
    public String getTeacher() {

        return "teacher/add";
    }

    @RequestMapping("/teacher/list")
    public String getList() {
        return tchService.getList().toString();
    }

    @RequestMapping("/teacher/details/{id}")
    public String getDetails(@PathVariable Long id) {
        return tchService.getTeacher(id).toString();
    }

    @RequestMapping(value ="/teacher/delete/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        tchService.deleteTeacher(id);
        return "Deleted";
    }

    @RequestMapping(value ="/teacher/edit{id}",method=RequestMethod.POST)
    public String editTeacher(@PathVariable Long id) {
        tchService.editTeacher(id);
        return "Edited";
    }

    @RequestMapping(value = "/teacher/edit/{id}")
    public String getEdit(Model model, @PathVariable Long id) {
        model.addAttribute("mark", tchService.getTeacher(id));
        return "teacher/edit";
    }

}

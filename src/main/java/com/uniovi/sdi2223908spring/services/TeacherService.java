package com.uniovi.sdi2223908spring.services;

import com.uniovi.sdi2223908spring.entities.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
@Service
public class TeacherService {
    private List<Teacher> teacherList = new LinkedList<>();

    @PostConstruct
    public void init() {
        teacherList.add(new Teacher(1L, "65782345Z", "Luis", "Rodriguez", "Biologia"));
        teacherList.add(new Teacher(2L, "23986124T", "Ana", "Suarez", "Matematicas"));
        teacherList.add(new Teacher(3L, "12468723J", "Jose", "Marquez", "Biologia"));
        teacherList.add(new Teacher(4L, "23762001A", "Luisa", "Lopez", "Historia"));
    }

    public List<Teacher> getList() {
        return teacherList;
    }

    public Teacher getTeacher(Long id) {
        return teacherList.stream().filter(teacher ->
                teacher.getId().equals(id)).findFirst().get();
    }

    public void addTeacher(Teacher tch){
        if(tch.getId() == null){
            tch.setId(teacherList.get(teacherList.size()-1).getId() + 1);
        }
        teacherList.add(tch);
    }
    public void deleteTeacher(Long id){
        teacherList.removeIf(teacher -> teacher.getId().equals(id));
    }

    public void editTeacher(Long id){

    }
}


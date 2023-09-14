package com.atguigu.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {
    private List<Lesson> lessonList;
    private Map<String, Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    private String sid;
    private String sname;


    public void run(){
        System.out.println(sid + ": " + sname);
        System.out.println(teacherMap.toString());
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }
}

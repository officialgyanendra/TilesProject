package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

@RequestMapping(value="/addstudent")
public String addstudent(){
	System.out.println("******Showing addstudent jsp*****");
	return "AddStudentDef";
}
@RequestMapping(value="/searchstudent")
public String searchstudent(){
	System.out.println("******Showing searchstudent jsp*****");
	return "SearchStudentDef";
}


}

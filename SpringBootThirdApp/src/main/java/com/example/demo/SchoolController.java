package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SchoolController {
	
	@RequestMapping("/")
	public String info() {
		return "index";
		}
	
	
	@RequestMapping("/student")
		public String studentInfo(Model model) {
		List<Student> students=List.of(new Student(123,"Venkatesh",95.0),
				new Student(124,"Kalyan",90.0),
				new Student(125,"Santhosh",91.0),
				new Student(126,"Shiva",92.0),
				new Student(127,"SaiPavan",93.0));
		model.addAttribute("students", students);
		
		return "studentList";
		
			
		}
	@RequestMapping("/teacher")
	
	public String teachersInfo(Model model){
	List<Teacher>teachers=List.of(new Teacher("Sathya","FullStackJava", 2100087980l),
			                     new Teacher("Mr.Ratan","Spring",7897897890l),
			                     new Teacher("Mr.ratan","AdvJava", 9879879870l),
			                     new Teacher("Mr.", "*****", 0000000000l));
	model.addAttribute("teachers", teachers);
	return "teachersList"; 
		
	}
	}

	
	

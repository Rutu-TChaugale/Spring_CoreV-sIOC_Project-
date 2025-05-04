package com.sit.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sit.model.Student;

public class TestUsingCoreContainer {
	
	public static void main(String[] args) {
		Resource resource= new ClassPathResource("beans.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
						Student student = bf.getBean(Student.class);
						System.out.println(student.getRollno());
						System.out.println(student.getName());
						System.out.println(student.getAddr());
						System.out.println(student.getEmail());
	}

}

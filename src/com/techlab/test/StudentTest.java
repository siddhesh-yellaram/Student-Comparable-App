package com.techlab.test;

import java.util.*;

import com.techlab.model.CgpaComparator;
import com.techlab.model.IdComparator;
import com.techlab.model.NameComparator;
import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> s1 = new ArrayList<Student>();
		s1.add(new Student(2,"Ash","A",8.97));
		s1.add(new Student(1,"Sol","B",9.85));
		s1.add(new Student(4,"Clark","A",9.1));
		s1.add(new Student(3,"Ben","C",9.54));
		System.out.println("Before Sorting:\n");
		for(Student s:s1)
			System.out.println(s.toString());
		System.out.println();
		
		System.out.println("Sorting Based On Id:\n");
		Collections.sort(s1, new IdComparator());
		for(Student s:s1)
			System.out.println(s.toString());
		System.out.println();
		
		System.out.println("Sorting Based On Name:\n");
		Collections.sort(s1, new NameComparator());
		for(Student s:s1)
			System.out.println(s.toString());
		System.out.println();

		System.out.println("Sorting Based On CGPA:\n");
		Collections.sort(s1, new CgpaComparator());
		for(Student s:s1)
			System.out.println(s.toString());
		System.out.println();
	}
}

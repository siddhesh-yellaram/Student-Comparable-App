package com.techlab.model;

import java.util.Comparator;

public class CgpaComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getCgpa() > s2.getCgpa())
			return 1;
		else if(s1.getCgpa() < s2.getCgpa())
			return -1;
		else
			return 0;
	}

}

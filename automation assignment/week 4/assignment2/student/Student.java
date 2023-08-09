package org.student;

import org.department.Department;

public class Student extends Department{
    public void studentName() {
    	System.out.println("Student name: MESSI");
    }
    public void studentDept() {
    	System.out.println("Student Department : ece");
    }
    public void studentId() {
    	System.out.println("ID : 3456677");
    }
	
    public static void main(String[] args) {
		Student obj2=new Student();
		obj2.collegeName();
		obj2.collegeCode();
		obj2.collegeRank();
		obj2.depptName();
		obj2.studentName();
		obj2.studentDept();
		obj2.studentId();
	}
}

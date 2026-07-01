package com.langfundConstructors;

public class Course {
	int id;
	String name;

	public Course() {

		System.out.println("course class constructors called");

	}

	public Course(int id, String name) {
		System.out.println("parameterized constructors called from course");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method started from course");

	}

	public class Student extends Course {
		public Student(int id, String name) {
			super(id, name);
			System.out.println("parameterized constructors called");

		}

		public static void main(String[] args) {
			System.out.println("main method started from student");
			Course c = new Course();
			Student s = c.new Student(10, "bhumi");

			System.out.println(c.id);
			System.out.println(c.name);

		}

	}
}

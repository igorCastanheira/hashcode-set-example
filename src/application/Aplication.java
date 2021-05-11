package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("How many students for course A? :");
		int n = sc.nextInt();
		
		Set<Student> list = new HashSet<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Student id");
			int id = sc.nextInt();
			Student student = new Student(id);
			list.add(student);
		}

		System.out.println("How many students for course B? :");
		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++) {
			System.out.println("Enter Student id");
			int id = sc.nextInt();
			Student student = new Student(id);
			list.add(student);
		}

		System.out.println("How many students for course C? :");
		int n2 = sc.nextInt();
		for (int i = 0; i < n2; i++) {
			System.out.println("Enter Student id");
			int id = sc.nextInt();
			Student student = new Student(id);
			list.add(student);
		}

		System.out.println("Total students: " + list.size());

		sc.close();
	}

}

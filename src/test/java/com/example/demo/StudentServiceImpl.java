/*package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	List<Student> studentList = new ArrayList<Student>();
	int offSet = 0;

	@Override
	public List<Student> getAllStudent() {

		return studentList;
	}

	@Override
	// @Async
	public String addStudent(Student student) {
		System.out.println(Thread.currentThread().getName());
		Student stu = new Student(student.getName(), student.getAddress(), student.getId());
		studentList.add(student);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("completed");
		return student.getName();

	}

	public Student getStudentByID(String id) {
		boolean flag = false;
		List<Student> studentsbyid = new ArrayList<Student>();
		for (Student student : studentList) {
			if (student.getId().equals(id)) {
				flag = true;
				return student;
			}
			if (!flag) {
				throw new DataNotFoundException(id);
			}
		}
		return null;

	}

	@Override
	public List<Student> getTaggedCandidateList(String id, PagiNamtion pagiNamtion) {
		System.out.println(studentList.size());
		List<Student> studentList1 = new ArrayList<Student>();
		offSet = offSet + pagiNamtion.getOffset();
		int limit = pagiNamtion.getLimit();
		studentList1.addAll(studentList.subList(offSet, limit));
		return studentList1;

	}

}
*/
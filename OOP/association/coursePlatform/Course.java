package association.coursePlatform;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String title;

	private Instructor instructor;

	private List<Student> enrolledStudents = new ArrayList<>();

	public Course(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public String getInstructorName() {
		return instructor.getName();
	}

	public void enrollStudent(Student student) {
		enrolledStudents.add(student);
		student.setEnrolledCourse(this);
	}

	public List<Student> getStudents() {
		return enrolledStudents;
	}

}

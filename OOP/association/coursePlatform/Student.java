package association.coursePlatform;

public class Student {

	private String name;

	private Course enrolledCourse;

	public Student(String name) {
		this.name = name;
	}

	public void setEnrolledCourse(Course course) {
		this.enrolledCourse = course;
	}

	public String getName() {
		return name;
	}

	public Course getEnrolledCourse() {
		return enrolledCourse;
	}
}

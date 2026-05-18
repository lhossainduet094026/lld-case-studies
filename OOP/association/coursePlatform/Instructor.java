package association.coursePlatform;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

	private String name;

	private List<Course> courses = new ArrayList<>();

	public Instructor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
		course.setInstructor(this);
	}

	public List<Course> getCourses() {
		return courses;
	}
}

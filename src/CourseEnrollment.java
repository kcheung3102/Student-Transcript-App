public class CourseEnrollment {
    private String course;
    private int credits;
    private String grade;

    public CourseEnrollment(){};

    public CourseEnrollment(String course, int credits, String grade) {
        this.course = course;
        this.credits = credits;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}

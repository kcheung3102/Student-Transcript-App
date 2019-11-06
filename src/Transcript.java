import java.util.ArrayList;

public class Transcript {
    private int iD;
    private String firstName;
    private String lastName;
    private double gpa;
    private double qualityPoints;
    private ArrayList<CourseEnrollment> courseEnrollments;

    public Transcript(){}

    public Transcript(int iD, String firstName, String lastName, ArrayList<CourseEnrollment> courseEnrollments, double gpa) {
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseEnrollments = courseEnrollments;
        this.gpa = gpa;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<CourseEnrollment> getCourseEnrollments() {
        return courseEnrollments;
    }

    public void setCourseEnrollments(ArrayList<CourseEnrollment> courseEnrollments) {
        this.courseEnrollments = courseEnrollments;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getQualityPoints() {
        return qualityPoints;
    }

    public void setQualityPoints(double qualityPoints) {
        this.qualityPoints = qualityPoints;
    }

    public String displayText() {
        String str = "";
        str = firstName + " " + lastName + "\n" +
                "Student ID: " + iD + "\n" + qualityPoints;
        for(CourseEnrollment c: courseEnrollments) {
            str+= c.getCourse() + c.getCredits() + c.getGrade();
        }
        return str;
    }


}

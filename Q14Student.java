package quiz1;

public class Q14Student {
    private String name;
    private String studentID;
    private String degreeProgram;

    // Constructor to create a student
    public Q14Student(String name, String studentID, String degreeProgram) {
        this.name = name;
        this.studentID = studentID;
        this.degreeProgram = degreeProgram;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for student ID
    public String getStudentID() {
        return studentID;
    }

    // Getter for degree program
    public String getDegreeProgram() {
        return degreeProgram;
    }

    // Method to return a formatted String representation of the student
    @Override
    public String toString() {
        return "[" + name + ", ID: " + studentID + ", " + degreeProgram + "]";
    }
}

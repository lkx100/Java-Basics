class Department {
    String name;
    Department(String name) {this.name = name;}
}

class University {
    String universityname;
    Department dept;  // Aggregation
    University(String universityname, Department dept) {
        this.universityname = universityname;
        this.dept = dept;
    }
}

public class aggregation {
    public static void main(String[] args) {
        Department dept = new Department("AI-DS");  // Independent Department with University
        University uni = new University("KL Hyderabad", dept);
        // Here University obj has reference to Department obj
        // On uni, reference is removed --> dept still exists
    }    
}

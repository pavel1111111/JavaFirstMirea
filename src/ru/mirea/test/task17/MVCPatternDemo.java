package ru.mirea.test.task17;

public class MVCPatternDemo {
    public static Student retrieveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Pavel");
        student.setRollNo("RollNo");
        return student;
    }

    public static void main(String[] args) {
        Student model  = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Vlad");
        System.out.println("\nUpdating.....");
        controller.updateView();
    }
}

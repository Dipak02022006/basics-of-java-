class Student {
    private int rollNo;

    // Getter method
    public int getRollNo() {
        return rollNo;
    }

    // Setter method
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        System.out.println("Roll No: " + s.getRollNo());
    }
}

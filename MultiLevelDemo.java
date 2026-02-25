// Base class
class Student {
    int roll_no;

    void getRollNo(int r) {
        roll_no = r;
    }

    void displayRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

// Derived class 1
class Test extends Student {
    int sub1, sub2;

    void getMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Derived class 2
class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class MultiLevelDemo {
    public static void main(String[] args) {

        Result r = new Result();

        r.getRollNo(101);
        r.getMarks(85, 90);

        r.displayRollNo();
        r.displayMarks();
        r.displayResult();
    }
}

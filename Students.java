// (a) Student Class
class Student {
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

// (b) Test Class (inherits Student)
class Test extends Student {
    protected int sub1;
    protected int sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// (c) Sports Interface
interface Sports {
    void set(int sMarks);
}

// (d) Result Class (inherits Test and implements Sports)
class Result extends Test implements Sports {
    private int sportsMarks;

    public void set(int sMarks) {
        this.sportsMarks = sMarks;
    }

    public void display() {
        int total = sub1 + sub2 + sportsMarks;

        System.out.println("Roll No: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + total);
    }
}

// (e) Test Application
public class studets {
    public static void main(String[] args) {

        Result student = new Result();

        student.setRollNo(101);
        student.setMarks(80, 90);
        student.set(25);   // Sports marks

        student.display();
    }
}

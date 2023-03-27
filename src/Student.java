public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //Khởi tạo biến constructor
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //Phương thức tĩnh để thay đổi giá trị cho biến tĩnh
    static void change() {
        college = "CODEGYM";
    }

    //Phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class MainStaticMethod {
    public static void main(String[] args) {
        //Gọi Phương thức change
        Student.change();

        //Khởi tạo phương thức
        Student s1 =new Student(1,"Trọng");
        Student s2 =new Student(2,"Bảo");
        Student s3 =new Student(3,"Linh");

        //Gọi phương thức display
        s1.display();
        s2.display();
        s3.display();
    }
}

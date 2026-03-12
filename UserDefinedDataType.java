package OOPS;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Khushi";
        s1.rno = 12345;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Palak";
        s2.rno = 12222;
        s2.cgpa = 9.8;

        Student s3 = new Student();
        s3.name = "Ram";
        s3.rno = 12348;
        s3.cgpa = 7.5;
    }
}

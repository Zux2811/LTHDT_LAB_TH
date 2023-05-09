
package lab_thb3_b3;

public class LAB_THB3_B3 {
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String id;
    private String name;
    private int birthYear;

    public Student(String id, String name, int birthYear) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}

public class StudentList {
    private ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getId().equals(student.getId())) {
                System.out.println("Student with this ID already exists");
                return;
            }
        }
        students.add(student);
    }

    public void deleteStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                students.remove(s);
                return            }
        }
        System("Student with this ID does not exist");
    }

    public void editStudent(String id, String name, int birthYear) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(name);
                s.setBirthYear(birthYear);
                return;
            }
        }
        System.out.println("Student with this ID does not exist");
    }

    public Student findStudentById(String id) {
        (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Student> findStudentByName(String name) {
        ArrayList<Student> foundStudents = new ArrayList<Student>();
        for (Student s : students) {
            if (s.getName().equals(name)) {
                foundStudents.add(s);
            }
        }
        return foundStudents;
    }

    public void sortById() {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getId().compareTo(s2.getId());
            }
        });
    }

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        
        // add students
        studentList.addStudent(new Student("001", "Alice", 2000));
        studentList.addStudent(new Student("002", "Bob", 2001));
        studentList.addStudent(new Student("003", "Charlie", 2002));
        studentList.addStudent(new Student("004", "David", 2003));
        studentList.addStudent(new Student("005", "Eve", 2004));
        
        // list
<Student = studentList.getStudents();
        for (Student s : students) {
            System.out.println(s.getId() + ", " + s.getName() + ", " + s.getBirthYear());
        }
        
        // delete student
        studentList.deleteStudent("003");
        
        // edit student
        studentList.editStudent("002", "Bob Smith", 2001);
        
        // find student by ID
        Student foundStudent = studentList.findStudentById("005");
        System.out.println(foundStudent.getName());
        
        // find students by name
        ArrayList<Student foundStudents = studentList.findStudentByName("Alice");
        for (Student s : foundStudents) {
            System.out.println(s.getName());
        }
        
        // sort by ID
        studentList.sortById();
        for (Student s : students) {
            System.out.println(s.getId() + ", " + s.getName() + ", " + s.getBirthYear());
        }
    }
}
    public static void main(String[] args) {

    }
    
}

import java.util.ArrayList;
import java.util.Collections;

public class University
{
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void sortStudentsByName()
    {
        Collections.sort(students, (st2,st1) -> st2.getName().compareTo(st1.getName()));
        for (Student student : students)
        {
            System.out.printf("Имя: %s\nГруппа: %d\nОценка: %d\n\n",
                    student.getName(),student.getGroup(),student.getGrade());
        }
    }

    public void sortStudentsByGrade(int grade)
    {
        for (Student student : students)
        {
            if(student.getGrade() == grade)
            {
                System.out.printf("Имя: %s\nГруппа: %d\nОценка: %d\n\n",
                        student.getName(),student.getGroup(),student.getGrade());
            }
        }
    }
}

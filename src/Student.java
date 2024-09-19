public class Student
{
    private String name;
    private int group;
    private int grade;

    Student(String name, int group, int grade)
    {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() { return name; }
    public int getGroup() { return group; }
    public int getGrade() { return grade; }
}
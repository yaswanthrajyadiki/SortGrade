import java.util.List;
import java.util.ArrayList;

class SortGradeDemo {
  public static void main(String[] args) {
    List<Student> stuList = new ArrayList<Student>();
    Student s1 = new Student(8.5, 7.6, 7.3, 8.0, 7.9, "21/08/1994", "IH110");
    Student s2 = new Student(7.6, 8.6, 6.3, 7.5, 7.2, "2/01/1993", "IH113");
    Student s3 = new Student(7.4, 7.5, 7.6, 8.0, 8.5, "12/06/1994", "IH080");
    Student s4 = new Student(8.2, 9.2, 7.2, 7.0, 8.2, "14/11/1992", "IH085");
    Student s5 = new Student(8.5, 7.6, 7.3, 8.0, 7.9, "21/08/1994", "IH007");
    stuList.add(s1);
    stuList.add(s2);
    stuList.add(s3);
    stuList.add(s4);
    stuList.add(s5);
    SortGrade sg = new SortGrade(stuList);
    stuList = sg.sortingGrade();
    for (Student stu : stuList) {
    	System.out.println(stu);
    }
  }  
}
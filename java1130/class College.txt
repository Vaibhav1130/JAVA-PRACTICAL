class College
{
   void collegeInfo()
 {
   System.out.println("welcome to the government college of engineering dhamangao road yavatmal-445001");
 }
}

class Department extends College
{
   void DepartmentInfo()
 {
   System.out.println("This is a computer Department");
 }
}

class Student extends Department
{
   void studentInfo()
 {
   System.out.println("This is a student in computer Department");
 }
}

public class GCOEY
 {
   public static void main(String[] args)
 {

   Student student = new Student();

   student.collegeInfo();
   student.DepartmentInfo();
   student.studentInfo();
 }
}

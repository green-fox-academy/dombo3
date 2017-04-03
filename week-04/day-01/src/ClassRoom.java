public class ClassRoom {
  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Student student = new Student();

    System.out.println(teacher.teach(student));
    System.out.println(student.question(teacher));
  }
}

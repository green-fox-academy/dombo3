public class Student {
  public String learn(){
    return "Want to learn";
  }

  public String question(Teacher teacher) {
    return teacher.answer();
  }
}

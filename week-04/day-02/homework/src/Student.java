public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println( "Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " +
            previousOrganization + " who skipped " + skippedDays + " days from the course already" +
            ".");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }
  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }
}

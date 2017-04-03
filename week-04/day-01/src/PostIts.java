public class PostIts {
  public static void main(String[] args) {
    PostIt orange = new PostIt();
    orange.backgroundColor = "ORANGE";
    orange.text= "Idea 1";
    orange.textColor = "BLUE";

    PostIt pink = new PostIt();
    pink.backgroundColor = "PINK";
    pink.text = "Awesome";
    pink.textColor = "BLACK";

    PostIt yellow = new PostIt();
    yellow.backgroundColor = "YELLOW";
    yellow.text = "Superb!";
    yellow.textColor = "GREEN";

    orange = new PostIt("Orange", "Idea1", "BLUE");
    pink = new PostIt("PINK", "Awesome", "BLACK");
    yellow = new PostIt("YELLOW", "Superb!", "GREEN");

  }
}
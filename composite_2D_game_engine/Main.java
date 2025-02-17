
public class Main {
  public static void main(String[] args) {
    Graphic circle1 = new Circle();
    Graphic circle2 = new Circle();
    Graphic rectangle1 = new Rectangle();
    
    Group group1 = new Group();
    group1.add(circle1);
    group1.add(rectangle1);
    
    Group group2 = new Group();
    group2.add(circle2);

    Group rootGroup = new Group();
    Graphic circle3 = new Circle();
    rootGroup.add(group1);
    rootGroup.add(group2);
    rootGroup.add(circle3);

    System.out.println("Drawing the Composite Structure:");
    rootGroup.draw();
  }
}

import java.util.ArrayList;

class Group implements Graphic {
  private ArrayList<Graphic> children = new ArrayList<>();

  public void add(Graphic graphic) {
    children.add(graphic);
  }

  public void remove(Graphic graphic) {
    children.remove(graphic);
  }
  
  public void draw() {
    for (Graphic graphic : children) {
      graphic.draw();
    }
  }
}
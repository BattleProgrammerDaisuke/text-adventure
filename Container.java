import java.util.ArrayList;
public class Container{

  private String name;
  private ArrayList<Item> itemList;

  public Container(String name){
    this.name = name;
    itemList = new ArrayList<Item>();
  }
  
  public void addItem(Item item){
    itemList.add(item);
  }
  
  public Item getItem(int index){
    return itemList.get(index);
  }
  
  public void removeItem(int index){
    itemList.remove(index);
  }

}

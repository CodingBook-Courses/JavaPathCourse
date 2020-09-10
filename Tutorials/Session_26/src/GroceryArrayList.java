import java.util.ArrayList;
import java.util.List;

public class GroceryArrayList {
    private String name;
    private List<String> groceryList;

    public GroceryArrayList(String name) {
        this.name = name;
        this.groceryList = new ArrayList<>();
    }

    public void addGroceryItem(String name) {
        groceryList.add(name);
    }

    public boolean removeGroceryItem(int position) {
        if(isExist(position)) {
            groceryList.remove(position);
            return true;
        } else {
            System.out.println("This position is not available in this list");
            return false;
        }
    }

    public boolean editItem(int position, String newName) {
        if(isExist(position)) {
            groceryList.set(position, newName);
            return true;
        }
        return false;
    }

    private boolean isExist(int position) {
        if(position <= groceryList.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void printList() {
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + " => " + groceryList.get(i));
        }
    }
}

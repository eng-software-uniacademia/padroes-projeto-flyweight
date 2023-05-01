import java.util.ArrayList;
import java.util.List;

public class Character {
    private final String name;
    private final List<Item> items;

    public Character(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(String itemCode) {
        var item = ItemFactory.getItem(itemCode);
        items.add(item);
    }
}

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static final Map<String, Item> items = new HashMap<>();

    public static Item getItem(String itemCode) {
        var item = items.get(itemCode);
        if (item == null) {
            item = new Item(itemCode);
            items.put(itemCode, item);
        }
        return item;
    }

    public static int getItemsCount() {
        return items.size();
    }
}

public class Item {
    private final String code;

    public Item(String itemCode) {
        this.code = itemCode;
    }

    @Override
    public String toString() {
        return code;
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    void shouldReturnItems() {
        var character = new Character("Zé");
        character.addItem("waterbottle");
        character.addItem("waterbottle");
        character.addItem("burger");

        assertEquals(character.getItems().toString(), "[waterbottle, waterbottle, burger]");
    }

    @Test
    void shouldReturnItemCount() {
        var character = new Character("Zé");
        character.addItem("waterbottle");
        character.addItem("waterbottle");
        character.addItem("burger");

        assertEquals(ItemFactory.getItemsCount(), 2);
    }
}

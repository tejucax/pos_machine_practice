package pos.machine;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosMachineTest {

    @Test
    public void should_return_receipt() {
        PosMachine posMachine = new PosMachine();

        String expected = "***<store earning no money>Receipt***\n" +
                "Name: Coca-Cola, Quantity: 4, Unit price: 3 (yuan), Subtotal: 12 (yuan)\n" +
                "Name: Sprite, Quantity: 2, Unit price: 3 (yuan), Subtotal: 6 (yuan)\n" +
                "Name: Battery, Quantity: 3, Unit price: 2 (yuan), Subtotal: 6 (yuan)\n" +
                "----------------------\n" +
                "Total: 24 (yuan)\n" +
                "**********************";


        List<Items> items = posMachine.getItemInformation(posMachine.getQuantityPerBarcode(ItemDataLoader.loadBarcodes()), ItemDataLoader.loadAllItems());
        System.out.println("items" + items.get(0).getBarcode() + items.get(0).getName() + items.get(0).getQuantity() + items.get(0).getPrice());

//        assertEquals(expected, posMachine.printReceipt(ItemDataLoader.loadBarcodes()));
    }
}

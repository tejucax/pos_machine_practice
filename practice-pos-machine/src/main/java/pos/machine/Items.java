package pos.machine;

public class Items {
    public String barcode;
    public String name;
    public int price;

    public int quantity;

    public int subtotal;

    public Items(String barcode, String name, int price, int quantity, int subtotal) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setBarcode(String value){
        this.barcode = value;
    }

    public void setName(String value){
        this.name = value;
    }

    public void setPrice(int value){
        this.price = value;
    }

    public void setSubtotal(int value){
        this.subtotal = value;
    }

    public void setQuantity(int value){
        this.quantity = value;
    }
}

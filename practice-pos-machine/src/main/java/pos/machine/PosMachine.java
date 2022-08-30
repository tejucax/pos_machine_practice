package pos.machine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {
        return null;
    }

    public List<Items> getQuantityPerBarcode(List<String> item){
        List<String> distinctItems = item.stream().distinct().collect(Collectors.toList());
        List<Items> receipt = new ArrayList<>();


        for(int i = 0; i < distinctItems.size(); i++){
            int counter = 0;
            for(int j = 0; j < item.size(); j++){
                if(distinctItems.get(i).equals(item.get(j))){
                    counter = counter + 1;
                }
            }
            receipt.add(new Items(distinctItems.get(i), "", 0, counter, 0));
        }
        return receipt;
    }

    public List<Item> getAllItem(){
        return ItemDataLoader.loadAllItems();
    }

    public List<Items> getItemInformation(List<Items> receipt, List<Item> item){
        for(int i = 0; i < receipt.size(); i++){
            for(int j = 0; j < item.size(); j++){
                if(receipt.get(i).getBarcode().equals(item.get(j).getBarcode())){
                    receipt.get(i).setName(item.get(j).getName());
                    receipt.get(i).setPrice(item.get(j).getPrice());
                }
            }
        }
        return receipt;
    }

    public List<Items> getSubtotal(List<Items> receipt){
        for(int i = 0; i < receipt.size(); i++){
            receipt.get(i).setSubtotal(receipt.get(i).getQuantity() * receipt.get(i).getPrice());
        }

        return receipt;
    }

    public int getTotal(List<Items> receipt){
        int total = 0;
        for(int i = 0; i < receipt.size(); i++){
            total = total + receipt.get(i).getSubtotal();
        }
        return total;
    }
}

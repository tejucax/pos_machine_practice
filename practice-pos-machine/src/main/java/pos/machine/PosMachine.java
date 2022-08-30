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
}

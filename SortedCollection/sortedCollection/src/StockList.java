import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String , StockItems> list;
    public StockList()
    {
        this.list = new LinkedHashMap<>();
    }
    public int addStock(StockItems item)
    {
        if(item != null)
        {
            // check if already have quantities of this item
            StockItems inStock = list.getOrDefault(item.getName(), item);
            //StockItems inStock = list.get(item.getName());
            // if there are already stocks on this item, adjust the quantity
            if(inStock != item)
            //if(inStock != null)
            {
                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(),item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity)
    {
        StockItems inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0))
        {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItems get(String key)
    {
        return list.get(key);
    }

    public Map<String, Double>PriceList()
    {
        Map<String, Double>prices = new LinkedHashMap<>();
        for(Map.Entry<String ,StockItems> item: list.entrySet())
        {
            prices.put(item.getKey(),item.getValue().getPrice());

        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItems> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s ="\n Stock List \n";
        double totalCost = 0.0;
        for(Map.Entry<String ,StockItems> item: list.entrySet())
        {
            StockItems stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items :";
            s = s + String.format("%2f",itemValue) +"\n";
            totalCost += itemValue;
        }
        return s + " Total stock value " + totalCost;


    }
}

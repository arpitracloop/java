import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockList, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItems item, int quantity)
    {
        if((item != null) && (quantity>0))
        {
            int inBasket = list.getOrDefault(item,0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }
    public Map<StockList, Integer> Items()
    {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " +name + " contains "+list.size() + ( (list.size()==1)?" item ":"items")+ "\n";
        double totalCost = 0.0;

        for(Map.Entry<StockItems,Integer> item : list.entrySet())
        {
            s = s + item.getKey()+". "+item.getValue()+" purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();

        }
        return s + " Total cost " + totalCost;
    }
}

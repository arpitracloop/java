public class Main {
    private static StockList stockList =new StockList();
    public static void main(String[] args) {

        StockItems temp =new StockItems("Bread", 0.86,100);
        stockList.addStock(temp);

        temp =new StockItems("Cake", 1.86,50);
        stockList.addStock(temp);

        temp =new StockItems("car", 12.56,1);
        stockList.addStock(temp);

        temp =new StockItems("chair", 3.86,70);
        stockList.addStock(temp);

        temp =new StockItems("table", 0.86,70);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.item.keySet())
        {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket,"cup",2);
        System.out.println(timsBasket);

        sellItem(timsBasket,"car",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"car",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"juice",1);
        System.out.println(timsBasket);

        System.out.println(stockList);
    }
    public static int sellItem(Basket basket, String item, int quantity)
    {
        StockItems stockItems = stockList.get(item);
        if(stockItems == null)
        {
            System.out.println("We don't sell "+item);
            return 0;
        }
        if(stockList.sellStock(item, quantity)!=0)
        {
            basket.addToBasket(stockItems, quantity);
            return quantity;
        }
        return 0;
    }

}

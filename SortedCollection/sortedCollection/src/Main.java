public class Main {
    private static StockList stockList =new StockList();
    public static void main(String[] args) {

        StockItems temp =new StockItems("Bread", 0.86,100);
        stockList.addStock(temp);

        temp =new StockItems("Cake", 1.86,50);
        stockList.addStock(temp);

        temp =new StockItems("car", 12.56,10);
        stockList.addStock(temp);

        temp =new StockItems("chair", 3.86,70);
        stockList.addStock(temp);

        temp =new StockItems("table", 0.86,70);
        stockList.addStock(temp);

        System.out.println(stockList);
    }
}

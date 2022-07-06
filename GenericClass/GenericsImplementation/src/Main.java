public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team mantud = new Team(("Mantud"));
        mantud.addPlayer(joe);
        mantud.addPlayer(pat);
        mantud.addPlayer(beckham);

        System.out.println(mantud.numPlayers());
    }
//    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        //items.add("hello");
//        items.add(3);
//        items.add(4);
//
//        printDouble(items);
//    }
//
//    private static void printDouble(ArrayList<Integer> N)
//    {
//        for(Object i:N)
//        {
//            System.out.println((Integer)i*2);
//        }
//    }
}



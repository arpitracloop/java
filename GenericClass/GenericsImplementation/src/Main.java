public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> mantud = new Team<>(("Mantud"));
        mantud.addPlayer(joe);
        //mantud.addPlayer(pat);
        //mantud.addPlayer(beckham);

        System.out.println(mantud.numPlayers());

        Team<BaseballPlayer> coerbasketballteam = new Team<>("CoerBaskballTeam");
        coerbasketballteam.addPlayer(pat);


        Team<SoccerPlayer> brokenTeam = new Team<>("error");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> Chealsea = new Team<>("Chealsea");
        FootballPlayer banks = new FootballPlayer("Messy");
        Chealsea.addPlayer(banks);

        Team<FootballPlayer> RealMadrid = new Team<>("RealMadrid");
        Team<FootballPlayer> Finland = new Team<>("Finland");
        Chealsea.matchResult(Finland, 1,0);
        Chealsea.matchResult(mantud,3,8);

        mantud.matchResult(Chealsea,2,1);
        mantud.matchResult(Finland,2,2);

        System.out.println("Rankings...");
        System.out.println(mantud.getName() + " : " + mantud.ranking()  );
        System.out.println(Chealsea.getName() + " : " + Chealsea.ranking()  );
        System.out.println(Finland.getName() + " : " + Finland.ranking()  );


        System.out.println(mantud.compareTo(Finland));
        System.out.println(mantud.compareTo(Chealsea));
    }
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




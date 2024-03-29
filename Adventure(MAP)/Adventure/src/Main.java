import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static Map<Integer, Location>locations = new HashMap<Integer,Location>();
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        locations.put(0,new Location(0,"You are sitting in front of laptop"));
        locations.put(1,new Location(1,"You are outside office"));
        locations.put(2,new Location(2,"You are in balcony"));
        locations.put(3,new Location(3,"You are opposite to laptop"));
        locations.put(4,new Location(4,"You are seeing light"));
        locations.put(5,new Location(5,"You are seeing floor"));

        locations.get(1).addExit("A",3);
        locations.get(1).addExit("D",2);

        locations.get(2).addExit("A",3);
        locations.get(2).addExit("D",1);

        locations.get(3).addExit("A",2);
        locations.get(3).addExit("D",1);
        locations.get(3).addExit("S",5);

        locations.get(4).addExit("A",1);
        locations.get(4).addExit("A",3);
        locations.get(4).addExit("S",5);

        locations.get(5).addExit("W",4);
        locations.get(5).addExit("A",3);
        locations.get(5).addExit("S",1);
        locations.get(5).addExit("D",2);



        int loc = 1;
        while(true)
        {
            System.out.println(locations.get(loc).getDescription());
            if(loc==0)
            {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are: ");
            for(String exit : exits.keySet())
            {
                System.out.print(exit+", ");
            }
            System.out.println();

            String direction =S.nextLine().toUpperCase();

            if(exits.containsKey(direction))
            {
                loc = exits.get(direction);
            }
            else {
                System.out.println("You cannot go in that direction");
            }

            loc = S.nextInt();
            if(!locations.containsKey(loc))
            {
                System.out.println("You got stuck");
            }
        }



    }
}

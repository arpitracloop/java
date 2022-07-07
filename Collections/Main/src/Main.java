import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Theatre theatre = new Theatre("Wave",8,12);




        //theatre.getSeats();
//        if(theatre.reserveSeat("E10"))
//        {
//            System.out.println("Please pay!");
//        }
//        else {
//            System.out.println("Sorry, this seat is taken...");
//        }
//        if(theatre.reserveSeat("H11"))
//        {
//            System.out.println("Please pay...");
//        }
//        else {
//            System.out.println("Sorry, this seat is taken...");
//        }
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02"))
        {
            System.out.println("Please pay for the seat " );
        }
        else {
            System.out.println("Seat alredy booked");
        }

       // Collections.shuffle(seatCopy);
        //Collections.rotate(seatCopy,48);
//        Collections.reverse(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);

//        Collections.frequency(seatCopy,"A11");
//        printList(seatCopy);
////
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//
//        System.out.println("Min seat is" + minSeat.getSeatNumber());
//
//        System.out.println("Max seat is " + maxSeat.getSeatNumber());
    }
    public static void printList(List<Theatre.Seat> list)
    {
        for(Theatre.Seat seat:list)
        {
            System.out.print(" "+ seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================================");





    }
}

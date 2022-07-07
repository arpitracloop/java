public class Main
{
    public static void main(String[] args)
    {
        Theatre theatre = new Theatre("Wave",8,12);
        //theatre.getSeats();
        if(theatre.reserveSeat("E10"))
        {
            System.out.println("Please pay!");
        }
        else {
            System.out.println("Sorry, this seat is taken...");
        }
//        if(theatre.reserveSeat("H11"))
//        {
//            System.out.println("Please pay...");
//        }
//        else {
//            System.out.println("Sorry, this seat is taken...");
//        }


    }
}

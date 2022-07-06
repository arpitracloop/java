class Movie
{
    private String name;
    public Movie(String name)
    {
        this.name=name;
    }
    public String plot()
    {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Movie1 extends Movie
{
    public Movie1()
    {
        super("Movie1");
    }

    @Override
    public String plot() {
        return "this is a plot for movie1";
    }
}

class Movie2 extends Movie
{
    public Movie2()
    {
        super("Movie2");
    }

    @Override
    public String plot() {
        return "this is a plot for movie2";
    }
}

class Movie3 extends Movie
{
    public Movie3()
    {
        super("Movie3");
    }

    @Override
    public String plot() {
        return "this is a plot for movie 3";
    }
}

class Movie4 extends Movie
{
    public Movie4()
    {
        super("Movie4");
    }
    // no plot here

}


public class Main
{

    public static void main(String[] args)
    {
        for(int i=1;i<11;i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie -> "+i+
                    " : " + movie.getName()+"\n"+
                    "Plot: "+ movie.plot()+"\n" );
        }

    }
    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random() *5)+1;
        System.out.println("Random number generated is "+randomNumber);
        switch(randomNumber)
        {
            case 1:
                return new Movie1();
            case 2:
                return new Movie2();
            case 3:
                return new Movie3();
            case 4:
                return new Movie4();
            default:
                return new Movie("No Movie");

        }
       // return null;


    }
}

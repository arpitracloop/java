public class SimpleCalculator {
    private double firstName;
    private double secondName;

    public void setFirstName(double FN)
    {
        FN = this.firstName;
    }
    public void setSecondName(double SN)
    {
        SN = this.secondName;
    }

    public double getFirstName() {
        return firstName;
    }

    public double getSecondName() {
        return secondName;
    }
    public double getAdditionResult()
    {
        return firstName+secondName;
    }
    public double getSubtractionResult()
    {
        return firstName-secondName;
    }
    public double getMultiplicationResult()
    {
        return firstName*secondName;
    }
    public double getDivisionResult()
    {
        if(secondName==0)
        {
            return 0;
        }
        else
        {
            return firstName/secondName;
        }
    }
}

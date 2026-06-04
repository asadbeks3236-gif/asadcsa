public class Bottle
{
    private double capacity;   // maximum amount the bottle can hold
    private double amount;     // current amount of liquid in the bottle

    /** Constructs a Bottle filled to its capacity. */
    public Bottle(double cap)
    {
        capacity = cap;
        amount = cap;   // bottle starts full
    }

   
    public double updateAmount(double amt)
    {
        amount -= amt;

        // check if below 25% threshold
        if (amount < capacity * 0.25) {
            amount = capacity;   // refill
        }

        return amount;
    }
}


import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits(int num)
    {
        digitList = new ArrayList<>();
        digitList.add(0, new Integer(num % 10));
        int numRemaining = num / 10;
        while(numRemaining > 0)
        {
            digitList.add(0, new Integer(numRemaining % 10));
            numRemaining /= 10;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for(int i = 1; i < digitList.size(); i++)
        {
            if (digitList.get(i - 1).compareTo(digitList.get(i)) >= 0)
            {
                return false;
            }
        }
        return true;
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}

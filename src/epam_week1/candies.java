package epam_week1;

public class candies extends gift{
	boolean check_range(int l,int h)
    {
        if(weight>=l && weight<=h)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

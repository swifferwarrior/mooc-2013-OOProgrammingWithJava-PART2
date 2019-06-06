public interface NationalService {
    int getDaysLeft(); //returns number of days left on service
    void work();        //reduces the working days by one. Working days number can't be negative.
}

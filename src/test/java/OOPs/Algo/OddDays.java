package OOPs.Algo;

public class OddDays {

    public int OddDays(int givenYear){

        int hund1 = givenYear/100;
        int hund4 = givenYear/400;
        int leapYEar = givenYear >> 2;
        int ordYear = givenYear - leapYEar;
        if (hund1 > 0){
            ordYear += hund1;
            leapYEar -= hund1;
        }

        if (hund4 > 0){
            ordYear -= hund4;
            leapYEar += hund4;
        }
        int days = ordYear + (leapYEar * 2);
        int odd = days % 7;
        return odd;
    }
}

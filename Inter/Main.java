package Inter;

public class Main {
    public static void main(String[] args) 
    {
        ITelephone timPhone = new DeskPhone(123456);

        timPhone.powerOn();
        timPhone.callPhone(123456);
        timPhone.answer();
    }
}

package demoDI;

import javax.management.InstanceNotFoundException;

public class Client {
    public static void main(String[] args) throws InstanceNotFoundException {
        IBanhXe banhXe = (IBanhXe) Injection.getInstance("banhxe");
        Xe xe = new Xe();
        xe.setBanhXe(banhXe);
        xe.run();
        IBanhXe banhXe2 = (IBanhXe) Injection.getInstance("banhxe2");
        Xe xe2 = new Xe();
        xe2.setBanhXe(banhXe2);
        xe2.run();
    }
}

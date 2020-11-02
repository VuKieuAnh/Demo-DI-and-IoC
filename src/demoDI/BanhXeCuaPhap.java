package demoDI;

public class BanhXeCuaPhap implements IBanhXe {
    @Override
    public void run(String mess) {
        System.out.println("Phap");
    }
}

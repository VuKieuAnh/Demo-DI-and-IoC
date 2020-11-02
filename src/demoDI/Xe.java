package demoDI;

public class Xe {
    private IBanhXe banhXe;

    public IBanhXe getBanhXe() {
        return banhXe;
    }

    public void setBanhXe(IBanhXe banhXe) {
        this.banhXe = banhXe;
    }

    //
//    public Xe(IBanhXe banhXe) {
//        this.banhXe = banhXe;
//    }

    public void run(){
        banhXe.run("Xe ");
    }
}

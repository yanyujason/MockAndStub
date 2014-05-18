package cashregister;

/**
 * Created by yyan on 5/16/14.
 */
public class MockPrinter extends Printer {
    private String info;

    public void print(String info) {
           this.info = info;
    }

    public String receive(){
        return this.info;
    }
}

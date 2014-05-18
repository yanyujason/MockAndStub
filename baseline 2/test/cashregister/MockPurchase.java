package cashregister;

/**
 * Created by yyan on 5/16/14.
 */
public class MockPurchase extends Purchase {
    private String info;
    public MockPurchase(String info) {
        super(null);
        this.info = info;
    }

    @Override
    public String asString() {
        return this.info;
    }
}

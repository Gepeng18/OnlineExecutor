import appendix.AbstractClass;

public class AbstractTest extends AbstractClass {
    @Override
    public int abstractFun() {
        return 0;
    }

    public static void main(String[] args) {
        new AbstractTest().abstractFun();
        new AbstractTest().publicFun();
    }
}

import site.pyyf.execute.HackScanner;
import site.pyyf.execute.HotSwapClassLoader;
import site.pyyf.service.ExecuteStringSourceService;

import java.util.HashMap;

public class NormalClass {
    public static void main(String[] args) throws ClassNotFoundException {
        new HotSwapClassLoader(new HashMap<>()).loadClass("NormalClass");
    }

}


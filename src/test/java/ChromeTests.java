import lec20.Chrome;
import lec20.Singleton;
import org.testng.annotations.Test;

public class ChromeTests
{
    @Test
    public void testOne()
    {
        Chrome chrome = Singleton.getInstance();
        System.out.println("Some manipulations1");
    }
    @Test
    public void testTwo()
    {
        Chrome chrome = Singleton.getInstance();
        //
        System.out.println("Some manipulations2");
    }
    @Test
    public void testThree()
    {
        Chrome chrome = Singleton.getInstance();
        //
        System.out.println("Some manipulations3");
    }
}

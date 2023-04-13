import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/** 
* TV Tester. 
* 
* @author <Authors name> 
* @since <pre>apr. 13, 2023</pre> 
* @version 1.0 
*/ 
public class TVTest {
    TV tv1 = new TV();

    @BeforeEach
    public void initEach() throws Exception {
        tv1.turnOn();
        tv1.setVolume(0);
        tv1.setChannel(0);
        tv1.turnOff();

    }

    /**
     * Method: turnOn()
     */
    @Test
    public void testTurnOn() throws Exception {
        tv1.turnOn();
        assertTrue(tv1.getTurnOn());

//TODO: Test goes here... 
    }

    /**
     * Method: turnOff()
     */
    @Test
    public void testTurnOff() throws Exception {
        tv1.turnOn();
        assertTrue(tv1.getTurnOn());
        tv1.turnOff();
        assertFalse(tv1.getTurnOn());
//TODO: Test goes here... 
    }

    /**
     * Method: setVolume(int volume)
     */
    @Test
    public void testSetVolume() throws Exception {
        tv1.setVolume(3);
        assertEquals(0, tv1.getVolume());
        tv1.turnOn();
        tv1.setVolume(3);
        assertEquals(3, tv1.getVolume());
//TODO: Test goes here... 
    }

    /**
     * Method: setChannel(int setChannel)
     */
    @Test
    public void testSetChannel() throws Exception {
        tv1.setChannel(30);
        assertEquals(0, tv1.getChannel());
        tv1.turnOn();
        tv1.setChannel(30);
        assertEquals(30, tv1.getChannel());
//TODO: Test goes here... 
    }

    /**
     * Method: TurnOn()
     */
    @Test
    public void channelUp() throws Exception {
        tv1.channelUp();
        assertEquals(0, tv1.getChannel());
        tv1.turnOn();
        tv1.channelUp();
        assertEquals(1, tv1.getChannel());
//TODO: Test goes here... 
    }

/**
 *
 * Method: getVolume()
 *
 */
}

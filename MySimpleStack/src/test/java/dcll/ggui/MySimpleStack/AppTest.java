package dcll.ggui.MySimpleStack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * test de is Empty
     */
    public void testEmpty()
    {
    	Implentation i1=new Implentation();
        assertTrue( i1.isEmpty() );
        i1.push(new Item("Coco"));
        assertFalse( i1.isEmpty() );
    }
    
    public void testSize()
    {
    	Implentation i1=new Implentation();
        assertTrue( i1.getSize()==0 );
        i1.push(new Item("Coco"));
        assertTrue( i1.getSize()==1 );
    }
}

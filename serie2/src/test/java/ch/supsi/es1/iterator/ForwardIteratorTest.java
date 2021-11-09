package ch.supsi.es1.iterator;

import ch.supsi.es1.list.MyList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ForwardIteratorTest {

    private MyList<String> list;
    private IMyIterator<String> iterator;

    @Before
    public void initIterator(){
        list = new MyList<>();
        list.addElement("Try 1");
        list.addElement("Try 2");
        iterator = list.getForwardIterator();
    }

    @Test
    public void testForwardIterator(){
        iterator.rewind();
        int listIndex = 0;
        while(iterator.hasMoreElements()){
            String currentElem = iterator.nextElement();
            assertEquals(list.getElement(listIndex),currentElem);
            listIndex++;
        }
        assertFalse(iterator.hasMoreElements());
    }

}

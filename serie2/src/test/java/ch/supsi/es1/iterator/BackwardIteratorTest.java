package ch.supsi.es1.iterator;

import ch.supsi.es1.MyList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BackwardIteratorTest {

    private MyList<String> list;
    private MyIterator<String> iterator;

    @Before
    public void initIterator(){
        list = new MyList<>();
        list.addElement("Try 1");
        list.addElement("Try 2");
        iterator = list.getBackwardIterator();
    }

    @Test
    public void testBackwardIterator(){
        iterator.rewind();
        int listIndex = list.length() - 1;
        while(iterator.hasMoreElements()){
            String currentElem = iterator.nextElement();
            assertEquals(list.getElement(listIndex),currentElem);
            listIndex--;
        }
        assertFalse(iterator.hasMoreElements());
    }

}

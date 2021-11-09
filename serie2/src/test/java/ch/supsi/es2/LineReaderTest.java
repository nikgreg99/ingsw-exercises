package ch.supsi.es2;

import ch.supsi.es1.list.MyList;
import ch.supsi.es1.iterator.IMyIterator;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class LineReaderTest {

    private  MyList<String> linesTest;

    @Before
    public void initList(){
        linesTest = new MyList<>();
    }

    @Test
    public void testLineReader() throws IOException {
        String expectedLines[] = {
                "Both iterators must be implemented using following interface:",
                "the first element.",
                "element,  whereas  BackwardIterator,  must  allow  the  iteration  from  the  last  to",
                "ForwardIterator  must  allow  the  iteration  on  the  list  from  the  first  to  the  last",
                "Create for this list two iterators."
        };
        System.setOut(new PrintStream(new FileOutputStream("testLines")));
        URL fileUri = PrinterApp.class.getClassLoader().getResource("lines");
        InputStreamReader fileReader = new InputStreamReader(fileUri.openStream());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            linesTest.addElement(line);
        }

        IMyIterator<String> lineBackwardIterator = linesTest.getBackwardIterator();

        int lineCounter = 0;
        String currentLine;
        while(lineBackwardIterator.hasMoreElements()){
            currentLine = lineBackwardIterator.nextElement();
            assertEquals(expectedLines[lineCounter],currentLine);
            lineCounter++;
            System.out.println(currentLine);
        }

    }

}

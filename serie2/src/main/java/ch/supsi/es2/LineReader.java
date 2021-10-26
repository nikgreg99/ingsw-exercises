package ch.supsi.es2;

import ch.supsi.es1.MyList;
import ch.supsi.es1.iterator.MyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class LineReader {
    public static void main(String[] args) throws IOException {
        MyList<String> lines = new MyList<>();
        URL fileUri = LineReader.class.getClassLoader().getResource("lines");
        InputStreamReader fileReader = new InputStreamReader(fileUri.openStream());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            lines.addElement(line);
        }

        MyIterator<String> lineBackwardIterator = lines.getBackwardIterator();

        String currentLine;
        while(lineBackwardIterator.hasMoreElements()){
            currentLine = lineBackwardIterator.nextElement();
            System.out.println(currentLine);
        }
    }
}

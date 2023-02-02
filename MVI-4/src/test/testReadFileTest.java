package test;

import org.junit.Test;
// import org.junit.jupiter.api.Test;
import prod.MVIFileStreamParser;
import prod.MVIFileStreamParser;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;


class testReadFileTest {

    @Test
    public void testCalculateArea() throws IOException {
        String fileName = "Substances.dat";
        MVIFileStreamParser parser = new MVIFileStreamParser();

        try {
            parser.readFile(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(parser.partsLine[parser.partsLine.length - 1]);

        String expectedValue = "TestE";
        String actualValue = parser.partsLine[parser.partsLine.length - 1];
        assertEquals(expectedValue, actualValue);
    }

}

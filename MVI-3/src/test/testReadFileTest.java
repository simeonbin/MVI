package test;

import org.junit.jupiter.api.Test;
import prod.MVIFileParser;

import static org.junit.jupiter.api.Assertions.assertEquals;


class testReadFileTest {

    @Test
    public void testReadFile() {
        String fileName = "Substances.dat";
        MVIFileParser parser = new MVIFileParser();

        parser.readFile(fileName);

        System.out.println(parser.partsLine[parser.partsLine.length - 1]);

        String expectedValue = "TestE";
        String actualValue = parser.partsLine[parser.partsLine.length - 1];
        assertEquals(expectedValue, actualValue);
    }

}

package test;

import org.junit.Test;
import prod.MVIFileStreamParser;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class testReadFile2Test {

        @Test
        public void testReadFile() throws IOException {
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

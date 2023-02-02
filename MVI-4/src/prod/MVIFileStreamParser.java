package prod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class MVIFileStreamParser {

    private String fileName;
    public String[] partsLine;

    public String getFilename() {
        return fileName;
    }

    public String[] getPartsLine() {
        return partsLine;
    }

    public void setFileName(String filename) {
        this.fileName = filename;
    }
    private void attributesOfLine(String[] partsLine) {

        for (int i=0; i < partsLine.length; i++) {
            int lenPart = partsLine[i].length();
            System.out.print("attribute length:" + lenPart + " ");
            //        System.out.print(partsLine[partsLine.length-1]);
        }
    }


    public void readFile(String fileName) throws IOException {
        AtomicInteger numOfLines = new AtomicInteger();


                    Stream<String> lines = Files.lines(Paths.get("Substances.dat"));

                    lines.forEach( line -> {

                    partsLine = line.split("\t");

                    attributesOfLine(partsLine);
                    System.out.println();

                    int numItemsLine = partsLine.length;

                    // Create a new LineItem object for each line in the file
                    MVILineItem item = new MVILineItem(line);
                    // Do something with the LineItem object
                    numOfLines.incrementAndGet();
                    String lineNumber = String.valueOf(numOfLines.get());
                    System.out.print (new StringBuilder().append("Line #: ").append(lineNumber).append(" ").toString());
                    System.out.print("Items number in Line: " + numItemsLine + " ");
                    System.out.println(item);
                    System.out.println();

                        // process the line here
                        System.out.println(line);
                    } );

                    lines.close();

                }


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fileName = scanner.nextLine();
        fileName = "Substances.dat";

        System.out.println("The filename you entered is: " + fileName);
        MVIFileStreamParser parser = new MVIFileStreamParser();

        parser.setFileName(fileName);                               // parser.setFileName("Substances.dat");
        fileName = parser.getFilename();                            // String filename = "Companies.dat";
        parser.readFile(fileName);
    }


    }


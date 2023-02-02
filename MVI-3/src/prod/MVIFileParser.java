package prod;

//public class SubstancesParser {

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MVIFileParser {
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
   //         System.out.print(partsLine[partsLine.length-1]);
        }
    }

        public void readFile(String fileName) {
            int numOfLines = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;

              //  numLines=0;
                while ((line = br.readLine()) != null) {
                    // Split the line by tabs
                    partsLine = line.split("\t");

                    attributesOfLine(partsLine);
                    System.out.println();

                    int numItemsLine = partsLine.length;

                    // Create a new LineItem object for each line in the file
                    MVILineItem item = new MVILineItem(line);
                    // Do something with the LineItem object
                    ++numOfLines;
                    String lineNumber = String.valueOf(numOfLines);
                    System.out.print (new StringBuilder().append("Line #: ").append(lineNumber).append(" ").toString());
                    System.out.print("Items number in Line: " + numItemsLine + " ");
                    System.out.println(item);
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a filename: ");
            String fileName = scanner.nextLine();

            System.out.println("The filename you entered is: " + fileName);
            MVIFileParser parser = new MVIFileParser();

            parser.setFileName(fileName);                               // parser.setFileName("Substances.dat");
            fileName = parser.getFilename();                            // String filename = "Companies.dat";
            parser.readFile(fileName);
        }


    }



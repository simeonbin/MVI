

'readFile' method of 'MVIFileStreamParser' class uses the Java-8 Stream library to read the rather large 'Substances.dat' file.

Reads the lines of the dat file, splits them up to save and process the individuaL parts of the line, that is the attributes of the substance elements.

Finds the number of the attributes in the line, and keeps track of their character length.

Then creates Objects out of the lines, and keeps the corresponding line in an object field as a String.

It finishes by printing out Line-Number, Number-of-Items-in-Line, and the Line itself.

In 'main' I ask for a Filename, create an instance of MVIFileStreamParser then pass the filename to the 'readFile' method.




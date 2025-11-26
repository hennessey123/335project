package filesstuff;

import java.io.*;
import java.util.ArrayList;

public class readTxtFile {
    public void readandprint(File file, Record[] records) throws FileNotFoundException {
        FileReader reader = new FileReader(file);
        System.out.println(
                "|firstname |lastname |dob       |phone        |street          |city         |state         |zip              |");
        for (int x = 0; x < records.length; x++) {
            System.out.println(
                    records[x].firstname + " " + records[x].lastname + " " + records[x].dob + " " + records[x].phone
                            + " " + records[x].city + " " + records[x].state + " " + records[x].zip);

        }
    }
}

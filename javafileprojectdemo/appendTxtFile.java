package filesstuff;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class appendTxtFile {
    public void appendandwrite(File file, File srcfile, Record[] records) throws IOException {
        FileReader fr = new FileReader(srcfile);
        FileWriter writer = new FileWriter(file, true);

        int i;

        int count = 0;
        int finalcount = 0;

        StringBuilder build = new StringBuilder();

        for (int x = 0; x < records.length; x++) {
            records[x] = new Record();

            while ((i = fr.read()) != -1) { // reads until out of chars

                build.append((char) i);

                if (finalcount == 5) {
                    finalcount = 0;
                    records[x].zip = build.toString().trim();
                    count = 0;

                    build.setLength(0);
                    writer.write(records[x].firstname + " " + records[x].lastname + " " + records[x].dob + " "
                            + records[x].phone + records[x].street + " " + records[x].city + " "
                            + records[x].state + " " + records[x].zip + '\n');
                    x += 1;
                }
                if (count == 7 && finalcount < 5) {
                    finalcount += 1;
                }
                if ((char) i == ',') {
                    count++;
                    if (count == 1) {
                        records[x].firstname = build.toString().trim();
                    } else if (count == 2) {
                        records[x].lastname = build.toString().trim();
                    } else if (count == 3) {
                        records[x].dob = build.toString().trim();
                    } else if (count == 4) {
                        records[x].phone = build.toString().trim();
                    } else if (count == 5) {
                        records[x].street = build.toString().trim();
                    } else if (count == 6) {
                        records[x].city = build.toString().trim();
                    } else if (count == 7) {
                        records[x].state = build.toString().trim();
                    } else if (count == 8 && finalcount == 5) {
                        records[x].zip = build.toString().trim();
                        count = 0;

                    }
                    build.setLength(0);

                }
            }
        }
        fr.close();
        writer.close();

    }
}

import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.io.InputStreamReader

object CreateTxtFile {
    var records: Array<Record?> = arrayOfNulls(150)

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        for (y in records.indices) {
            records[y] = Record()
        }
        val bfri = BufferedReader( // allows user to configure filename
            InputStreamReader(System.`in`)
        )

        print("Enter the Path : ")

        // Reading File name
        val path = bfri.readLine()
        val name = File(path)
        val srcFile = File("/Users/isaachennessey/Downloads/fake_data_records.txt")
        val srcFile2 = File("/Users/isaachennessey/Downloads/fake_data_records_50.txt")

        val edd = CreateWriteFile()
        edd.createandwrite(name, srcFile, false)
        edd.createandwrite(name, srcFile2, true)
        val ed = appendTxtFile()
        ed.appendandstorefile(name, records)
        val read = ReadTxtFile()
        read.readandprint(name, records)
//         JSON stuff
        val name2 = File("newjsonfile.json")
        val eddd = CreateJSONFile()
        eddd.createandwriteJSON(name2,records)

    }


}


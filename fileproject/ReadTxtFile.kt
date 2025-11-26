import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import CreateTxtFile
import Record

class ReadTxtFile {
    @Throws(FileNotFoundException::class)
    fun readandprint(file: File, records: Array<Record?>) {
        val reader = FileReader(file)
        println(
            "|firstname |lastname |dob       |phone        |street          |city         |state         |zip              |"
        )
        for (x in records.indices) {
            println(
                (records[x]!!.firstname + " " + records[x]!!.lastname + " " + records[x]!!.dob + " " + records[x]!!.phone
                        + " " + records[x]!!.city + " " + records[x]!!.state + " " + records[x]!!.zip)
            )
        }
    }
}

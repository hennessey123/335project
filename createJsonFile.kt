import java.io.File
import com.google.gson.Gson

fun cJF(file : File, sourceFile : File) {
    file.createNewFile()

    val content = sourceFile.readLines()
    if (content.size != 100){
        println("File does not contain exactly 50 records.")
    }

    val records = mutableListOf<Record>()
    content.forEach { line ->
        val fields = line.trim().split(",")
        if (fields.size == 8){
            records.add(Record(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7]))
        }
        else{
            println("Fields need to be 8 . Counting: ${fields.size} fields")
        }
    }
    val gson = Gson()
    file.bufferedWriter().use{ writer ->
        gson.toJson(records, writer)
    }

}
fun main(){
    val directory = "project_files"
    val filePathTxt = "/Users/danielabbott/Documents/exampleTxt.txt"
    val filePathJson = "/Users/danielabbott/Documents/exampleJson.txt"
    val dir = File(directory)

    if (!dir.exists()) {
        dir.mkdirs()
    }

    val fileTxt = File(filePathTxt)
    val fileJson = File(filePathJson)

    val sourcePath100 = "/Users/danielabbott/Downloads/fake_data_records.txt"
    val sourceFile100 = File(sourcePath100)
    val sourcePath50 = "/Users/danielabbott/Downloads/fake_data_records_50.txt"
    val sourceFile50 = File(sourcePath50)

    if (!sourceFile100.exists()) {
        println("Source file does not exist: $sourcePath100")
        return
    }
    if (!sourceFile50.exists()) {
        println("Source file does not exist: $sourcePath50")
        return
    }

    cJF(fileJson, sourceFile100)
}
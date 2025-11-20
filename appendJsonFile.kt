import java.io.File
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

fun aJF(file : File, sourceFile50 : File) {
    if (!sourceFile50.exists()) {
        println("Source file does not exist")
        return
    }


    val content = sourceFile50.readLines()

    if (content.size != 50){
        println("Source file must contain exactly 50 records. Counting: ${content.size} records")
    }

    val gson = Gson()
    val listType = object : TypeToken<MutableList<Record>>() {}.type
    val existingRecords : MutableList<Record> = file.bufferedReader().use { reader ->
        gson.fromJson(reader, listType)
    }

    val newRecords = mutableListOf<Record>()
    content.forEach { line ->
        val fields = line.trim().split(",")
        if (fields.size == 8){
            newRecords.add(Record(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7]))
        }
        else{
            println("Fields need to be 8 . Counting: ${fields.size} fields")
        }

    }

    existingRecords.addAll(newRecords)
    file.bufferedWriter().use { writer ->
        gson.toJson(existingRecords, writer)
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
    aJF(fileJson, sourceFile50)
}
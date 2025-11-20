import java.io.File
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

fun rJF(file : File) : List<Record> {
    val gson = Gson()
    val listType = object : TypeToken<List<Record>>() {}.type
    val records: List<Record> = file.bufferedReader().use { reader ->
        gson.fromJson(reader, listType)
    }
    return records

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
    pT(rJF(fileJson))
}
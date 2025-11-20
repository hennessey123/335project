import java.io.File

fun main() {
    val directory = "project_files"
    val filePathTxt = "$directory/exampleTxt.txt"
    val filePathJson = "$directory/exampleJson.txt"
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
    aJF(fileJson, sourceFile50)

    println("JSON FILE START")
    pT(rJF(fileJson))
}
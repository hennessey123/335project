
import com.google.gson.Gson
import java.io.File
import java.io.FileWriter
import java.io.IOException
import kotlinx.serialization.json.*


class CreateJSONFile {
    @Throws(IOException::class)
    fun createandwriteJSON(file: File, records: Array<Record?>) {
        val obj: Array<JsonObject?> = arrayOfNulls<JsonObject?>(150)
        val dataMap = mapOf(
            "name" to JsonPrimitive("Alice"),
            "age" to JsonPrimitive(30),
            "isStudent" to JsonPrimitive(false),
            "courses" to JsonArray(listOf(JsonPrimitive("Math"), JsonPrimitive("Science")))
        )

        val jsonObject = JsonObject(dataMap)

        // Convert JsonObject to a JSON string
        val jsonString = Json.encodeToString(JsonObject.serializer(), jsonObject)
        println(jsonString)
        try {
            file.createNewFile()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        var x: Int
        val writer: FileWriter = FileWriter(file, true)
        x = 0
        while (x < obj.size) {
            val dataMap = mapOf(
                "firstname" to JsonPrimitive(records[x]?.firstname),
                "lastname" to JsonPrimitive(records[x]?.lastname),
                "dob" to JsonPrimitive(records[x]?.dob),
                "phone" to JsonPrimitive(records[x]?.phone),
                "street" to JsonPrimitive(records[x]?.street),
                "city" to JsonPrimitive(records[x]?.city),
                "state" to JsonPrimitive(records[x]?.state),
                "zip" to JsonPrimitive(records[x]?.zip),
                )
            val jsonoj = JsonObject(dataMap)
            println(jsonoj.toString())
            writer.write(jsonoj.toString())
            x++
        }
        writer.close()
    }
}
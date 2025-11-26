import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException

class CreateWriteFile {
    @Throws(IOException::class)
    fun createandwrite(file: File, srcfile: File, jeff: Boolean) {
        try {
            file.createNewFile()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        val fr = FileReader(srcfile) // reads characters
        var i: Int

        val writer = FileWriter(file, jeff)
        var count = 0
        var finalcount = 0

        val build = StringBuilder()

        while ((fr.read().also { i = it }) != -1) { // reads until out of chars

            build.append(i.toChar())

            if (finalcount == 5) {
                finalcount = 0
                writer.write(build.toString() + '\n')
                count = 0

                build.setLength(0)
            }
            if (count == 7 && finalcount < 5) {
                finalcount += 1
            }
            if (i.toChar() == ',') {
                count++
                writer.write(build.toString())
                build.setLength(0)
            }
        }
        fr.close()
        writer.close()
    }
}

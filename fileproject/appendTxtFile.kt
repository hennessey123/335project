import java.io.File
import java.io.FileReader
import java.io.IOException
import CreateTxtFile
import Record

class appendTxtFile {
    @Throws(IOException::class)
    fun appendandstorefile(file: File, records: Array<Record?>) {
        val fr = FileReader(file)

        var i: Int

        var count = 0
        var finalcount = 0

        val build = StringBuilder()

        var x = 0
        while (x < records.size) {
            records[x] = Record()

            while ((fr.read().also { i = it }) != -1) { // reads until out of chars

                build.append(i.toChar())

                if (finalcount == 5) {
                    finalcount = 0
                    records[x]!!.zip = build.toString().trim { it <= ' ' }
                    count = 0
                    build.setLength(0)

                    x += 1
                }
                if (count == 7 && finalcount < 5) {
                    finalcount += 1
                }
                if (i.toChar() == ',') {
                    count++
                    if (count == 1) {
                        records[x]!!.firstname = build.toString().trim { it <= ' ' }
                    } else if (count == 2) {
                        records[x]!!.lastname = build.toString().trim { it <= ' ' }
                    } else if (count == 3) {
                        records[x]!!.dob = build.toString().trim { it <= ' ' }
                    } else if (count == 4) {
                        records[x]!!.phone = build.toString().trim { it <= ' ' }
                    } else if (count == 5) {
                        records[x]!!.street = build.toString().trim { it <= ' ' }
                    } else if (count == 6) {
                        records[x]!!.city = build.toString().trim { it <= ' ' }
                    } else if (count == 7) {
                        records[x]!!.state = build.toString().trim { it <= ' ' }
                    } else if (count == 8 && finalcount == 5) {
                        records[x]!!.zip = build.toString().trim { it <= ' ' }
                        count = 0
                    }
                    build.setLength(0)
                }
            }
            x++
        }

        fr.close()
    }
}

/*
import java.io.File

fun cTF(file : File, sourceFile : File) {
    file.createNewFile()

    val content = sourceFile.readLines()
    if (content.size != 100) {
        throw IllegalStateException("Source file must contain exactly 100 records. Counting: ${content.size} records")
    }

    file.writeText(content.joinToString(separator = "\n"))
}
*/

import java.io.File

fun cTF2() {
    val directoryPath = System.getProperty("user.home") + "/Documents"
    val file = File(directoryPath, "records.txt")
    val isCreated = file.createNewFile()
    if (isCreated) {
        println("File created in directory $directoryPath")
    } else {
        println("File already exists")
    }
    file.writeText(
        "James,Smith,1985-06-15,512-345-6789,123 Main St,Chicago,IL,60601,\n" +
                "Emma,Johnson,1992-03-22,713-456-7890,456 Park Ave,Houston,TX,77002,\n" +
                "Liam,Brown,1978-11-10,602-567-8901,789 Oak Dr,Phoenix,AZ,85003,\n" +
                "Olivia,Taylor,2001-09-05,215-678-9012,321 Cedar Rd,Philadelphia,PA,19104,\n" +
                "Noah,Wilson,1965-12-25,210-789-0123,654 Pine Ln,San Antonio,TX,78205,\n"+
                "Ava,Davis,1998-07-18,619-890-1234,987 Elm St,San Diego,CA,92106,\n"+
                "William,Clark,1980-02-14,214-901-2345,147 Washington Blvd,Dallas,TX,75207,\n"+
                "Sophia,Lewis,1972-04-30,408-012-3456,258 Lake Ave,San Jose,CA,95108,\n"+
                "Michael,Walker,1995-08-09,512-123-4567,369 Hill Dr,Austin,TX,78709,\n"+
                "Isabella,Hall,1988-01-27,904-234-5678,741 River Rd,Jacksonville,FL,32210,\n"+
                "Alexander,Allen,2003-10-03,614-345-6789,852 Maple St,Columbus,OH,43211,\n"+
                "Mia,Young,1970-05-17,206-456-7890,963 Church Ln,Seattle,WA,98112,\n"+
                "Daniel,Hernandez,1993-12-01,312-567-8901,159 Main Ave,Chicago,IL,60613,\n"+
                "Charlotte,King,1982-09-08,832-678-9012,357 Park Dr,Houston,TX,77014,\n"+
                "Henry,Wright,1968-06-20,480-789-0123,468 Oak St,Phoenix,AZ,85015,\n"+
                "Amelia,Lopez,1997-03-12,267-890-1234,579 Cedar Ln,Philadelphia,PA,19116,\n"+
                "James,Johnson,1989-11-28,726-901-2345,681 Pine Ave,San Antonio,TX,78217,\n"+
                "Emma,Smith,1975-07-04,858-012-3456,792 Elm Rd,San Diego,CA,92118,\n"+
                "Liam,Taylor,2000-02-19,469-123-4567,813 Washington St,Dallas,TX,75219,\n"+
                "Olivia,Wilson,1983-08-15,669-234-5678,924 Lake Dr,San Jose,CA,95120,\n"+
                "Noah,Davis,1991-05-01,737-345-6789,135 Hill Ave,Austin,TX,78721,\n"+
                "Ava,Clark,1967-10-26,813-456-7890,246 River Ln,Jacksonville,FL,32222,\n"+
                "William,Lewis,1994-04-11,513-567-8901,357 Maple St,Columbus,OH,43223,\n"+
                "Sophia,Walker,1986-12-07,425-678-9012,468 Church Rd,Seattle,WA,98124,\n"+
                "Michael,Hall,1979-09-23,773-789-0123,579 Main St,Chicago,IL,60625,\n"+
                "Isabella,Allen,2002-06-18,281-890-1234,681 Park Ave,Houston,TX,77026,\n"+
                "Alexander,Young,1984-03-04,623-901-2345,792 Oak Dr,Phoenix,AZ,85027,\n"+
                "Mia,Hernandez,1996-11-29,484-012-3456,813 Cedar Rd,Philadelphia,PA,19128,\n"+
                "Daniel,King,1971-07-15,830-123-4567,924 Pine Ln,San Antonio,TX,78229,\n"+
                "Charlotte,Wright,1987-02-10,760-234-5678,135 Elm St,San Diego,CA,92130,\n"+
                "Henry,Lopez,1999-10-06,682-345-6789,246 Washington Blvd,Dallas,TX,75231,\n"+
                "Amelia,Smith,1973-05-22,650-456-7890,357 Lake Ave,San Jose,CA,95132,\n"+
                "James,Brown,1990-12-08,361-567-8901,468 Hill Dr,Austin,TX,78733,\n"+
                "Emma,Taylor,1981-08-24,727-678-9012,579 River Rd,Jacksonville,FL,32234,\n"+
                "Liam,Wilson,2004-04-19,440-789-0123,681 Maple St,Columbus,OH,43235,\n"+
                "Olivia,Davis,1976-01-05,360-890-1234,792 Church Ln,Seattle,WA,98136,\n"+
                "Noah,Clark,1993-09-21,872-901-2345,813 Main Ave,Chicago,IL,60637,\n"+
                "Ava,Lewis,1988-06-16,346-012-3456,924 Park St,Houston,TX,77038,\n"+
                "William,Walker,1970-03-02,520-123-4567,135 Oak Dr,Phoenix,AZ,85039,\n"+
                "Sophia,Hall,1995-11-18,610-234-5678,246 Cedar Rd,Philadelphia,PA,19140,\n"+
                "Michael,Allen,1982-07-04,210-345-6789,357 Pine Ln,San Antonio,TX,78241,\n"+
                "Isabella,Young,2000-02-20,619-456-7890,468 Elm St,San Diego,CA,92142,\n"+
                "Alexander,Hernandez,1977-10-05,214-567-8901,579 Washington Blvd,Dallas,TX,75243,\n"+
                "Mia,King,1992-05-01,408-678-9012,681 Lake Ave,San Jose,CA,95144,\n"+
                "Daniel,Wright,1984-12-17,512-789-0123,792 Hill Dr,Austin,TX,78745,\n"+
                "Charlotte,Lopez,1969-08-02,904-890-1234,813 River Rd,Jacksonville,FL,32246,\n"+
                "Henry,Smith,1997-03-18,614-901-2345,924 Maple St,Columbus,OH,43247,\n"+
                "Amelia,Johnson,1980-11-03,206-012-3456,135 Church Ln,Seattle,WA,98148,\n"+
                "James,Taylor,1994-06-29,312-123-4567,246 Main St,Chicago,IL,60649,\n"+
                "Emma,Wilson,1972-02-14,713-234-5678,357 Park Ave,Houston,TX,77050,\n"+
                "Liam,Davis,1989-09-30,602-345-6789,468 Oak Dr,Phoenix,AZ,85051,\n"+
                "Olivia,Clark,2002-07-15,215-456-7890,579 Cedar Rd,Philadelphia,PA,19152,\n"+
                "Noah,Lewis,1975-04-01,210-567-8901,681 Pine Ln,San Antonio,TX,78253,\n"+
                "Ava,Walker,1991-12-27,619-678-9012,792 Elm St,San Diego,CA,92154,\n"+
                "William,Hall,1983-08-12,214-789-0123,813 Washington Blvd,Dallas,TX,75255,\n"+
                "Sophia,Allen,1967-03-28,408-890-1234,924 Lake Ave,San Jose,CA,95156,\n"+
                "Michael,Young,1996-11-13,512-901-2345,135 Hill Dr,Austin,TX,78757,\n"+
                "Isabella,Hernandez,1979-06-29,904-012-3456,246 River Rd,Jacksonville,FL,32258,\n"+
                "Alexander,King,2004-02-14,614-123-4567,357 Maple St,Columbus,OH,43259,\n"+
                "Mia,Wright,1986-10-01,206-234-5678,468 Church Ln,Seattle,WA,98160,\n"+
                "Daniel,Lopez,1993-05-17,312-345-6789,579 Main Ave,Chicago,IL,60661,\n"+
                "Charlotte,Smith,1971-12-02,713-456-7890,681 Park St,Houston,TX,77062,\n"+
                "Henry,Brown,1988-07-18,602-567-8901,792 Oak Dr,Phoenix,AZ,85063,\n"+
                "Amelia,Taylor,2000-03-04,215-678-9012,813 Cedar Rd,Philadelphia,PA,19164,\n"+
                "James,Wilson,1977-10-20,210-789-0123,924 Pine Ln,San Antonio,TX,78265,\n"+
                "Emma,Davis,1995-06-05,619-890-1234,135 Elm St,San Diego,CA,92166,\n"+
                "Liam,Clark,1982-01-21,214-901-2345,246 Washington Blvd,Dallas,TX,75267,\n"+
                "Olivia,Lewis,1969-09-06,408-012-3456,357 Lake Ave,San Jose,CA,95168,\n"+
                "Noah,Walker,1990-04-22,512-123-4567,468 Hill Dr,Austin,TX,78769,\n"+
                "Ava,Hall,2003-12-08,904-234-5678,579 River Rd,Jacksonville,FL,32270,\n"+
                "William,Allen,1976-07-24,614-345-6789,681 Maple St,Columbus,OH,43271,\n"+
                "Sophia,Young,1992-03-09,206-456-7890,792 Church Ln,Seattle,WA,98172,\n"+
                "Michael,Hernandez,1984-10-25,312-567-8901,813 Main St,Chicago,IL,60673,\n"+
                "Isabella,King,1970-06-11,713-678-9012,924 Park Ave,Houston,TX,77074,\n"+
                "Alexander,Wright,1999-01-27,602-789-0123,135 Oak Dr,Phoenix,AZ,85075,\n"+
                "Mia,Lopez,1987-08-12,215-890-1234,246 Cedar Rd,Philadelphia,PA,19176,\n"+
                "Daniel,Smith,1974-03-29,210-901-2345,357 Pine Ln,San Antonio,TX,78277,\n"+
                "Charlotte,Johnson,1996-11-14,619-012-3456,468 Elm St,San Diego,CA,92178,\n"+
                "Henry,Taylor,1981-06-30,214-123-4567,579 Washington Blvd,Dallas,TX,75279,\n"+
                "Amelia,Wilson,2002-02-15,408-234-5678,681 Lake Ave,San Jose,CA,95180,\n"+
                "James,Davis,1989-09-01,512-345-6789,792 Hill Dr,Austin,TX,78781,\n"+
                "Emma,Clark,1977-04-17,904-456-7890,813 River Rd,Jacksonville,FL,32282,\n"+
                "Liam,Lewis,1994-12-03,614-567-8901,924 Maple St,Columbus,OH,43283,\n"+
                "Olivia,Walker,1980-07-19,206-678-9012,135 Church Ln,Seattle,WA,98184,\n"+
                "Noah,Hall,1998-02-04,312-789-0123,246 Main Ave,Chicago,IL,60685,\n"+
                "Ava,Allen,1975-10-20,713-890-1234,357 Park St,Houston,TX,77086,\n"+
                "William,Young,1991-05-06,602-901-2345,468 Oak Dr,Phoenix,AZ,85087,\n"+
                "Sophia,Hernandez,1968-12-22,215-012-3456,579 Cedar Rd,Philadelphia,PA,19188,\n"+
                "Michael,King,1993-08-07,210-123-4567,681 Pine Ln,San Antonio,TX,78289,\n"+
                "Isabella,Wright,2000-03-24,619-234-5678,792 Elm St,San Diego,CA,92190,\n"+
                "Alexander,Lopez,1986-11-09,214-345-6789,813 Washington Blvd,Dallas,TX,75291,\n"+
                "Mia,Smith,1972-06-25,408-456-7890,924 Lake Ave,San Jose,CA,95192,\n"+
                "Daniel,Brown,1995-02-10,512-567-8901,135 Hill Dr,Austin,TX,78793,\n"+
                "Charlotte,Taylor,1983-09-26,904-678-9012,246 River Rd,Jacksonville,FL,32294,\n"+
                "Henry,Wilson,1979-05-12,614-789-0123,357 Maple St,Columbus,OH,43295,\n"+
                "Amelia,Davis,1997-12-28,206-890-1234,468 Church Ln,Seattle,WA,98196,\n"+
                "James,Clark,1984-08-13,312-901-2345,579 Main St,Chicago,IL,60697,\n"+
                "Emma,Lewis,1971-03-30,713-012-3456,681 Park Ave,Houston,TX,77098,\n"+
                "Liam,Walker,1990-11-15,602-123-4567,792 Oak Dr,Phoenix,AZ,85099,\n"+
                "Olivia,Hall,2003-07-01,215-234-5678,813 Cedar Rd,Philadelphia,PA,19100,\n")

    println("All records written to $file")
    /* code used for testing
        file.appendText("$$$$$$$$$$$$$$$")
        println("data appended to $file")
     */
}
fun main(){
    cTF2()
}
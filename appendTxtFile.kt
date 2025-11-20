/*
mport java.io.File

fun aTF(file : File, sourceFile : File) {
    val content = sourceFile.readLines()
    if (content.size != 50){
        throw IllegalStateException("Source file must contain exactly 50 records. Counting: ${content.size} records")
    }
    file.appendText(sourceFile.readLines().joinToString(separator = "\n"))

}

 */

import java.io.File

fun aTF2() {
    File("/Users/danielabbott/Documents/records.txt").appendText(
        "James,Brown,1966-04-12,305-123-4567,159 Cedar Ave,Chicago,IL,60602,\n"+
                "Emma,Walker,1999-07-28,415-234-5678,753 Pine St,Houston,TX,77003,\n"+
                "Liam,Hernandez,1981-02-03,702-345-6789,426 Oak Ln,Phoenix,AZ,85004,\n"+
                "Olivia,King,1974-10-19,503-456-7890,819 Elm Dr,Philadelphia,PA,19105,\n"+
                "Noah,Lopez,2002-05-05,786-567-8901,372 Main Rd,San Antonio,TX,78206,\n"+
                "Ava,Smith,1987-12-21,206-678-9012,645 Park Blvd,San Diego,CA,92107,\n"+
                "William,Johnson,1970-09-06,303-789-0123,918 Washington St,Dallas,TX,75208,\n"+
                "Sophia,Taylor,1994-03-23,510-890-1234,291 Lake Ave,San Jose,CA,95109,\n"+
                "Michael,Wilson,1983-11-08,720-901-2345,564 Hill Dr,Austin,TX,78710,\n"+
                "Isabella,Davis,2000-06-24,813-012-3456,837 River Rd,Jacksonville,FL,32211,\n"+
                "Alexander,Clark,1976-01-09,216-123-4567,210 Maple St,Columbus,OH,43212,\n"+
                "Mia,Lewis,1991-08-25,425-234-5678,483 Church Ln,Seattle,WA,98113,\n"+
                "Daniel,Allen,1968-05-11,773-345-6789,756 Main Ave,Chicago,IL,60614,\n"+
                "Charlotte,Young,1985-02-26,832-456-7890,129 Park Dr,Houston,TX,77015,\n"+
                "Henry,Hall,1997-10-12,623-567-8901,402 Oak St,Phoenix,AZ,85016,\n"+
                "Amelia,Wright,1972-07-28,484-678-9012,675 Cedar Rd,Philadelphia,PA,19117,\n"+
                "James,Taylor,1989-04-14,830-789-0123,948 Pine Ave,San Antonio,TX,78218,\n"+
                "Emma,Wilson,2003-11-29,858-890-1234,321 Elm Rd,San Diego,CA,92119,\n"+
                "Liam,Davis,1978-08-15,682-901-2345,594 Washington Blvd,Dallas,TX,75220,\n"+
                "Olivia,Clark,1995-03-02,669-012-3456,867 Lake Dr,San Jose,CA,95121,\n"+
                "Noah,Lewis,1982-12-18,737-123-4567,240 Hill Ave,Austin,TX,78722,\n"+
                "Ava,Allen,1967-09-03,727-234-5678,513 River Ln,Jacksonville,FL,32223,\n"+
                "William,Young,1992-06-19,440-345-6789,786 Maple St,Columbus,OH,43224,\n"+
                "Sophia,Hall,1980-01-04,360-456-7890,159 Church Rd,Seattle,WA,98125,\n"+
                "Michael,Wright,1998-10-20,872-567-8901,432 Main St,Chicago,IL,60626,\n"+
                "Isabella,Taylor,1975-05-06,346-678-9012,705 Park Ave,Houston,TX,77026,\n"+
                "Alexander,Wilson,1990-02-21,520-789-0123,978 Oak Dr,Phoenix,AZ,85027,\n"+
                "Mia,Davis,2004-09-07,610-890-1234,351 Cedar Rd,Philadelphia,PA,19128,\n"+
                "Daniel,Clark,1986-06-23,726-901-2345,624 Pine Ln,San Antonio,TX,78229,\n"+
                "Charlotte,Lewis,1971-03-09,760-012-3456,897 Elm St,San Diego,CA,92130,\n"+
                "Henry,Allen,1993-12-25,469-123-4567,270 Washington Blvd,Dallas,TX,75231,\n"+
                "Amelia,Young,1988-07-10,650-234-5678,543 Lake Ave,San Jose,CA,95132,\n"+
                "James,Hall,1973-04-26,361-345-6789,816 Hill Dr,Austin,TX,78733,\n"+
                "Emma,Wright,2001-11-11,813-456-7890,189 River Rd,Jacksonville,FL,32234,\n"+
                "Liam,Taylor,1984-08-27,513-567-8901,462 Maple St,Columbus,OH,43235,\n"+
                "Olivia,Wilson,1969-05-13,425-678-9012,735 Church Ln,Seattle,WA,98136,\n"+
                "Noah,Davis,1996-02-28,312-789-0123,108 Main Ave,Chicago,IL,60637,\n"+
                "Ava,Clark,1981-10-14,713-890-1234,381 Park St,Houston,TX,77038,\n"+
                "William,Lewis,2002-07-01,602-901-2345,654 Oak Dr,Phoenix,AZ,85039,\n"+
                "Sophia,Allen,1977-03-17,215-012-3456,927 Cedar Rd,Philadelphia,PA,19140,\n"+
                "Michael,Young,1994-12-02,210-123-4567,300 Pine Ln,San Antonio,TX,78241,\n"+
                "Isabella,Hall,1989-09-18,619-234-5678,573 Elm St,San Diego,CA,92142,\n"+
                "Alexander,Wright,1966-06-04,214-345-6789,846 Washington Blvd,Dallas,TX,75243,\n"+
                "Mia,Taylor,2000-01-20,408-456-7890,219 Lake Ave,San Jose,CA,95144,\n"+
                "Daniel,Wilson,1985-08-05,512-567-8901,492 Hill Dr,Austin,TX,78745,\n"+
                "Charlotte,Davis,1970-04-21,904-678-9012,765 River Rd,Jacksonville,FL,32246,\n"+
                "Henry,Clark,1997-11-06,614-789-0123,138 Maple St,Columbus,OH,43247,\n"+
                "Amelia,Lewis,1982-06-22,206-890-1234,411 Church Ln,Seattle,WA,98148,\n"+
                "James,Allen,1999-03-08,312-901-2345,684 Main St,Chicago,IL,60649,\n"+
                "Emma,Young,1974-12-24,713-012-3456,957 Park Ave,Houston,TX,77050,\n")

    println("50 records appended to file")
}
fun main(){
    aTF2()
}
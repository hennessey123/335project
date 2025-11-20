fun pT(records: List<Record>) {
    println("| First Name | Last Name | DOB        | Phone           | Street Address     | City           | State | Zip     |")
    println("|------------|-----------|------------|-----------------|--------------------|----------------|-------|---------|")

    records.forEach { record ->
        println("| ${record.firstName.padEnd(10)} | ${record.lastName.padEnd(9)} | ${record.dob.padEnd(10)} | ${record.phone.padEnd(15)} | ${record.street.padEnd(22)} | ${record.city.padEnd(14)} | ${record.state.padEnd(5)} | ${record.zip.padEnd(7)} |")
    }
}
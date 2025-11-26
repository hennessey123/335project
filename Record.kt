class Record {
    var firstname: String? = null
    var lastname: String? = null
    var dob: String? = null
    var phone: String? = null
    var street: String? = null
    var city: String? = null
    var state: String? = null
    var zip: String? = null

    override fun toString(): String {
        println(
            (firstname + " " + lastname + " " + dob + " " + phone + " " + street + " " + city + " "
                    + state + " " + zip)
        )
        return super.toString()
    } // Getters and setters (omitted for brevity)
}
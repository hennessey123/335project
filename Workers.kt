// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Workers(private val i: Int, private val j: Int) : Runnable {
    override fun run() {
        for (k in i..<j) {
            println(k)
        }
    }
}

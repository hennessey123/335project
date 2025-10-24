//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.nio.ByteBuffer

fun main() {
    byteBufferExample()
}

fun byteBufferExample() {
    // A ByteBuffer manages a memory buffer internally
    val buffer = ByteBuffer.allocate(10000)

    // Write to buffer (moves position forward automatically)
    for(i in 0..9999){
        buffer.put(i.toByte())
    }




    // Prepare buffer for reading
    buffer.flip()

    // Read data in order
    while (buffer.hasRemaining()) {
        println(buffer.get())
    }
    Thread.sleep(50000)
}
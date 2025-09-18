// No need to import java.lang.Thread explicitly
class MyRunnable1 {
    

    companion object {
        var num_threads: Int = 5
        var num_iteration: Int = 100

        
        fun main(args: Array<String>) {
            val chunk: Int = num_iteration / num_threads
            val workers = arrayOfNulls<Workers>(num_threads)
            for (i in 0..<num_threads) {
                val startIndex = i * chunk
                var endIndex = (i + 1) * chunk
                if (i == num_threads - 1) {
                    endIndex = num_iteration
                }
                workers[i] = Workers(startIndex, endIndex)
            }
            val thread = arrayOfNulls<Thread>(num_threads)

            for (i in 0..<num_threads) {
                thread[i] = Thread(workers[i])

                try {
                    thread[i]!!.join()
                } catch (e: InterruptedException) {
                    // TODO Auto-generated catch block
                    e.printStackTrace()
                }
                thread[0]!!.setPriority(1)
            }

            for (i in 0..4) {
                if (i == 0) {
                    thread[0]!!.setPriority(1)
                    thread[0]!!.start()
                }
                if (i == 1) {
                    thread[1]!!.setPriority(10)
                    thread[1]!!.start()
                }
                if (i == 2) {
                    thread[2]!!.setPriority(4)
                    thread[2]!!.start()
                }
                if (i == 3) {
                    thread[3]!!.setPriority(6)
                    thread[3]!!.start()
                }
                if (i == 4) {
                    thread[4]!!.setPriority(1)
                    thread[4]!!.start()
                }
            }
        }
    }
}

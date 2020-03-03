fun main(args: Array<String>) {
    // interface isnt a object
    // it creates a object for you with the example callback | anonymous inner class
    speakName(callback = object: ExampleCallback{
        override fun speakMyName(name: String) {
            println("myName: $name")

        }

    })
}

// this object will refer to that object above (ExampleCallback)
fun speakName(callback: ExampleCallback) {
    callback.speakMyName("Ted")
    callback.speakMyName("Ryan")
    callback.speakMyName("Dylan")
}

package chapter2

object HelloWorld {
	def main(args:Array[String]) {
		val msg = "Hello, world!"
		// Java typedef val
		val msg2: java.lang.String = "Hello again, world!"
		// Shorter Java typedef val
		val msg3: String = "Hello yet again, world!"

		println(msg)

		// Reassignment to val unallowed by compiler
		// msg = "Goodbye cruel world!"

		var greeting = "Hello, world!"
		greeting = "Leave me alone, world"
	}
}

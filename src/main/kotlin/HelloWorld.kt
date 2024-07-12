fun main() {
    println(
        """
        Hello, world!

        You are using Kotlin version ${KotlinVersion.CURRENT}
        (should be at least 2.0.0).
        
        You are using Java JVM version ${System.getProperty("java.version")}
        (should be at least 21.0.3).
        """.trimIndent(),
    )
}

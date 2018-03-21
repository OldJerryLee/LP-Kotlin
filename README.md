https://try.kotlinlang.org/#/Examples/Basic%20syntax%20walk-through/Use%20when/Use%20when.kt

https://try.kotlinlang.org/#/Examples/Basic%20syntax%20walk-through/Use%20when/Use%20when.kt

http://www.99-bottles-of-beer.net/language-kotlin-2901.html

when (obj) {
    1 -> println("One")
    "Hello" -> println("Greeting")
    is Long -> println("Long")
    !is String -> println("Not a string")
    else -> println("Unknown")
}

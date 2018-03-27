## Gramática XText capaz de reconhecer o comando when de Kotlin##

### Alunos Fabrício Pujol e Gabriel Paul ###

Exemplo que usamos para testar a linguagem:

when (obj) {
    1 -> println("One")
    "Hello" -> println("Greeting")
    is Long -> println("Long")
    !is String -> println("Not a string")
    else -> println("Unknown")
}

FONTES:

(Onde obtemos o exemplo)
https://try.kotlinlang.org/#/Examples/Basic%20syntax%20walk-through/Use%20when/Use%20when.kt 

(Exemplo de código de 99 bottles-of-beer que possui o when em kotlin)
http://www.99-bottles-of-beer.net/language-kotlin-2901.html

(Documentação de XText)
https://www.eclipse.org/Xtext/documentation/301_grammarlanguage.html

(Onde resolvemos o problema da regra poder não ser instanciada)
http://www.eclipse.org/forums/index.php/t/330928/f21569278f39f1f740e00a1ebb726e58/

# github do projeto #
https://github.com/OldJerryLee/LP-Kotlin
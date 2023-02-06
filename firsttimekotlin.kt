import  kotlin.random.Random


fun main(args: Array<String>) {
    println("Siemanko witam w moim portalu, proszę o podaniu loginu twojego konta:")
    val login: String = readLine().toString()

    //Teraz w wyświetla login

    println("Dziękujemy za podanie loginu, twój login to $login")
    Thread.sleep(1000)
    println("Teraz proszę o podanie swojego hasła:")
    var haslo: String = readLine().toString()
    var hasloapki = "elo"
    if (haslo == hasloapki) {
        var mylovenumber: Int = 21
        var pr = 1

        pr.konto()
        println("Moja ulubiona liczka to $mylovenumber czy wiesz o tym? \n $login $mylovenumber")

        println("Dziękuję serdecznie, proszę teraz podać jaki jest rok:")
        var rok: String = readLine().toString()
        println("Mamy $rok rok! Dziękuję")
        println("Teraz proszę podać swój rok urodzenia:")
        var rokurodzenia: String = readLine().toString()
        println("Super twój rok urodzenia to $rokurodzenia")
        var a: Int = rok.toInt()
        var b: Int = rokurodzenia.toInt()
        var clear = a - b
        println("Jestem mądrzejszy niż ci się to wydaje! Masz $clear")
        println("Zostajesz dalej zalogowany na koncie $login")
        if (clear > 18) {
            print("Super masz więcej jak 18 lat!\n")
            print("Zagramy sobie teraz w fajną grę, zgadnij liczbę od 1 do 10! Zaczynamy!\n")
            val x = Random.nextInt(1, 11)
            var liczlos: Int
            var los = 0
            do {
                los++
                print("Podaj liczę\n")
                liczlos = readLine()!!.toInt()

                if (x > los) {
                    println("Nie udało się zgadnąć... Wylosowana liczba jest większa od Twojej")
                }
                else if (x < a)
                {
                    println("Nie udało się zgadnąć... Wylosowana liczba jest mniejsza od Twojej")
                }
            } while (x != liczlos)
            println("Superancko jesteś gość udało ci za $los razem zgadnąć liczbę $x")


        } else {
            print("Niestety jesteś niepełnoletni!\n")
            Thread.sleep(1000)
            print("Pięc\n")
            Thread.sleep(1000)
            print("Cztery\n")
            Thread.sleep(1000)
            print("Trzy\n")
            Thread.sleep(1000)
            print("Dwa\n")
            Thread.sleep(1000)
            print("Jeden\n")
            Thread.sleep(1000)
            print("ZOSTAŁES WRYZUCONY Z SKARPY! Żegnaj $login")
        }

}
    else {
        print("Twoje hasło jest błędne\n")
        println("Teraz proszę o podanie swojego hasła:")
        var haslo: String = readLine().toString()
        if (haslo == hasloapki) {

        }
        else {
            print("Skończyły się twoje możliwości wprowadzania hasła, przykro nam...")
        }
    }
}
fun konto() {
    println("Twoj login $login Twoje hasło $haslo")
}
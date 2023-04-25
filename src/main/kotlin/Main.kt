fun main(){
    //words("Amanda")
    println(words("Amanda"))
     multiples()
    var currentAccount=CurrentAccount("789298738","Lumumba",300000)
    println(currentAccount.accountNumber)
    println(currentAccount.accountName)
    println(currentAccount.balance)

}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun words(word:String):Array<Any>{
  //var myWord="Amanda"
    arrayListOf<Any>()
    return word

   // return word.length(words)

}


//input string
//output character 1st,2nd and last, length and if it startswith a vowel or not

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)

fun multiples (numbers:Int) {

    for (number in numbers)

        if (number % 6 == 0 && number % 8 == 0)
            println("Bingo")
}

//5. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
class CurrentAccount( var accountNumber: String,var accountName:String, var balance:Int  ) {
    fun deposit(amount: Double, balance: Int): Double {


        var newBalance = balance + amount
     return newBalance

    }

    fun withdraw(amount: Double): Int {
        var withdrawn = 2000
        withdrawn -= balance
        return withdrawn
    }

    fun details(accountNumber: String, balance: Int, accountName: String): String {
        println("Account number ${accountNumber} with balance ${balance} is operated by ${accountName}")
    }
}

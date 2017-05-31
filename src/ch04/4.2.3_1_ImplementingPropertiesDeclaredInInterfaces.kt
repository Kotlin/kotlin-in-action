package ch04.ex2_3_1_ImplementingPropertiesDeclaredInInterfaces

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User {
    val nickname: String
}
class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}

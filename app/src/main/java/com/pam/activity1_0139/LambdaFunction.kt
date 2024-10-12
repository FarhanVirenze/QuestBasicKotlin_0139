package com.pam.activity1_0139

// Lambda Functions
// Lambda Functions adalah fungsi yang tidak memiliki nama
// Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi.

fun uppercaseString(string: String): String {
    return string.uppercase()
}

// Dapat ditulis dalam eskpresi lambda sbb :
fun main() {
    uppercaseString("hello")
    println({ string: String -> string.uppercase() }("hello"))
// Hello
}
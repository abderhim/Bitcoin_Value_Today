package com.tw.bitcoinpricetoday.utilities

import java.util.regex.Pattern

val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
    "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+"
)

class VerifyInputs {


    /*
    verifyEmail : Function that verify if email is correct or not
    @email : the email that will be tested
     */
    fun verifyEmail(email: String?): Boolean {
        return !email.isNullOrEmpty() && EMAIL_ADDRESS_PATTERN.matcher(email).matches()
    }


    /*
    verifyPassword : Function that verify if passoword is correct or not
    password is correct if it's not null and its length >= 8
     */
    fun verifyPassword(password: String?): Boolean {
        return !password.isNullOrEmpty()

    }

    fun verifyName(name: String?): Boolean {
        return !name.isNullOrEmpty()

    }



    fun verifyPhone(phone: String?): Boolean {
        return !phone.isNullOrEmpty() && phone.toInt() != null

    }



}



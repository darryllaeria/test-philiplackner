package com.example.testapplication

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * Input is not valid if
     * - username/password is empty
     * - username is already taken
     * - confirmed password is not same as the real password
     * - password contains less than 2 digits
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if(userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if(userName in existingUsers) {
            return false
        }
        if(password != confirmedPassword) {
            return false
        }
        if(password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}
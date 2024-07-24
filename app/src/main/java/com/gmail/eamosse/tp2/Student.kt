package com.gmail.eamosse.tp2

//TODO : Complete the class
data class Student(
    var name: String,
    var code: String,
    var sexe: String,
    var address: String,
    var age: Int
){
    init {
        require(sexe == "M" || sexe == "F") { "Sexe must be 'M' or 'F'" }
        require(age <= 100) { "Age must be under 100" }
        require(name.length > 1) { "Veuillez entrer un nom" }
        require(code.length > 1) { "chaque etudiant doit avoir un code" }
        require(address.length > 1) { "chaque etudiant doit avoir une addresse" }
    }
}
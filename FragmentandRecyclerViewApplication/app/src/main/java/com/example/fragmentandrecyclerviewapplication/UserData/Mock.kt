package com.example.fragmentandrecyclerviewapplication.UserData

object mock {
    val fady = User("Fady", "Senior Android Engineer", "01111111111", "October", "ghjkls@gmail.com")
    val mariam = User("Mariam", "Android Engineer", "02222222222", "Nasr City", "ghjkls@gmail.com")
    val ahmed = User("Ahmed", "Android Engineer", "03333333333", "Alexandria", "ghjkls@gmail.com")
    val mostafa = User("Mostafa", "Android Engineer", "04444444444", "Maadi", "ghjkls@gmail.com")
    val hassan = User("Hassan", "Android Engineer",  "05555555555", "Asyut", "ghjkls@gmail.com")
    val renad = User("Renad", "High school student", "06666666666", "Nasr City", "ghjkls@gmail.com")
    val hamza = User("Hamza","Middle school student", "07777777777", "Nasr City", "ghjkls@gmail.com")
    val mohamed = User("Mohamed", "Accountant","08888888888", "Mokattam", "ghjkls@gmail.com")


    val usersList = listOf<User>(
        fady, mariam, ahmed, mostafa, hassan, renad, hamza, mohamed
    )
}
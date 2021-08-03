object Ceaser extends App {
    //alphabet used for ceaser cipher
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    //function to encrypt one character
    val  = (c:Char,key:Int,a:String) => a((a.size + a.indexOf(c.toUpper) + (key % a.size)) % a.size)

    //function to decrypt one character
    val decryptor = (c:Char,key:Int,a:String) => a((a.size + a.indexOf(c.toUpper) - (key % a.size)) % a.size)
    
    // cipher function which takes encrypt or decrypt function as parameter and perform on given string
    val cipher = (algo:(Char,Int,String) => Char, s:String, key:Int, a:String) => s.map(algo(_, key, a))
    
    val res = cipher(encryptor, alphabet, 5, alphabet)

    println(res)
    println(cipher(decryptor, res, 5, alphabet))



}
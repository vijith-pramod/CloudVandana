function reverse( string, substr){

    return string.split(substr).reverse().join(substr)
}

    let string = "This is a sunny day"
    let string1 = reverse(string,"")
    let string2 = reverse(string1," ")

    console.log(string2)



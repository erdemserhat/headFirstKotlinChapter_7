import kotlin.math.exp

fun main(args: Array<String>) {

    //Chapter 7.Data Classes: Dealing with Data

    //== operator refers to equals function...
    //when a data class is created, equals function controls whether
    //the two data object store the same properties or not
    //If returns true, this means that two object store the same data.

    var a=User("Serhat","Erdem")
    var b=User("Serhat","Erdem")

    println(if(a.equals(b)) "a and b object are equal" else "a and b are different")
    //a.equals(b) returned true cause the data (properties) are stored in the objects were same.
    //data class  facilities compare to properties.

    //when you create a data class toString() function enables you to see current properties
    //on the object

    println(a.toString())
    //User(name=Serhat, surname=Erdem)

    //copy() function enables you copy whole properties from one object to another
    //as well as this future, you can change some of them ;

    var c = a.copy(name="ali")
    //This means that;
    //create a copy object of "a" and assign to c and change name property as "ali"


    //if a==b condition returns true, this means that hashcode of a and b are same.

    //ComponentN functions.
    //componentN function enable you to retrieve properties by corresponding order number.
    /**
     * Example;
     * class A(
     *          var attribute1:String
     *          var attribute2:String
     *          ){
     *       }
     * var myA = A("hello","world")
     * myA.component1 represents "hello" ->attribute1
     * myA.component2 represents "world" ->attribute2
     */


    var name= a.component1()

    var(name_,surname_)=a
    println("name:$name_")
    println("surname:$surname_")


    //Destructuring a object (useful for db processes)
    //if you want to destructure object and assign their every property to separate variable ;

    var mike=User("Tahsin","Akbıyık")
    var(username,usersurname)=mike
    println(username)
    println(usersurname)

    //this operation can be useful for sql queries.3

    var f=User("berkant","koca")
    var x =2
    println(f.name.hashCode())


    print( f.component2())










}
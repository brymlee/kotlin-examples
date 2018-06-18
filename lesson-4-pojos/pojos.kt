package brymlee.pojos

class Person(firstName:String, lastName:String){
	val firstName : String = firstName

	val lastName : String = lastName

	fun firstAndLastName() : String {
		return firstName + " " + lastName
	}
}

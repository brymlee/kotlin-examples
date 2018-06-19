package brymlee

fun addOne(it:Any) : Int{
	if(it is Int) {
		return it.plus(1)
	}else if(it is String){
		return it.toInt() + 1
	}
	throw RuntimeException("Bad stuff is happening")
}

class TypeHolder<T>(value:T){
	val value = value
}

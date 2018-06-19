package brymlee

import org.junit.Test
import org.junit.Assert.*
import brymlee.*

class Tests{

	@Test
	fun addOneGeneric(){
		assertEquals(2, addOne(1))
		assertEquals(2, addOne("1"))
	} 

	@Test
	fun pojoWithGenericType(){
		val typeHolder = TypeHolder<Int>(2)
		assertEquals(2, typeHolder.value)
	}
}

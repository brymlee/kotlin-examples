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
}

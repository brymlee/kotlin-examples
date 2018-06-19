package brymlee

import org.junit.Test
import org.junit.Assert.*
import brymlee.*

class Tests{

	@Test
	fun extendInt_addIsTwoFunction(){
		val one = 1
		assertFalse(one.isTwo())

		val two = 2
		assertTrue(two.isTwo())
	}

}

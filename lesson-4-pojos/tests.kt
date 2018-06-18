package brymlee

import org.junit.Test
import org.junit.Assert.*
import brymlee.pojos.*

class Tests{

	@Test
	fun instantiatePersonPojoSuccessfully(){
		val bobBarker = Person("Bob", "Barker")
		assertEquals("Bob", bobBarker.firstName)
		assertEquals("Barker", bobBarker.lastName)
		assertEquals("Bob Barker", bobBarker.firstAndLastName())
	}

}

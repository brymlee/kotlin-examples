package brymlee

import org.junit.Test
import org.junit.Assert.*
import brymlee.* 
import kotlin.ranges.IntProgression.*

class Tests{

	@Test
	fun doesNameFilterOutTom_noTomExists(){
		val names = listOf("Peter", "Bob", "Barker")
		val actualNames = nameFilter("Tom", names)
		assertEquals(Integer.valueOf(0), actualNames.size)
	}

	@Test
	fun doesNameFilterOutTom_twoTomsExist(){
		val names = listOf("Tom", "John", "Mary", "Barb", "Tom")
		val expectedNames = listOf("Tom", "Tom")
		val actualNames = nameFilter("Tom", names)
		assertEquals(expectedNames.size, actualNames.size)
	}

}




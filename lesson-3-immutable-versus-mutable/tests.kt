package brymlee

import org.junit.Test
import org.junit.Ignore
import org.junit.Assert.*

class Tests{

	@Ignore
	@Test
	fun constantsCannotBeReassigned(){
		/*val constantInteger:Int = 1 
		constantInteger = 2
		assertEquals(1, constantInteger)*/
	}

	@Test
	fun variablesCanBeModified(){
		var variableInteger = 1
		variableInteger++
		assertEquals(2, variableInteger)
	}

	@Test
	fun mutableListsCanBeModified(){
		var numbers:MutableList<Int> = mutableListOf(1, 2, 3)
		numbers.add(4)
		assertEquals(4, numbers.get(3))

		numbers = mutableListOf(3, 2, 1, 0)
		assertEquals(0, numbers.get(3))
	}

	@Test
	fun immutableListsCannotBeModified(){
		val numbers:List<Int> = listOf(1, 2, 3)
		assertEquals(3, numbers.get(2))

		//numbers = listOf(3, 2, 1)
		//assertEquals(1, numbers.get(2))
	}

}

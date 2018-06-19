package brymlee

import org.junit.Test
import org.junit.Assert.*
import java.io.File

class Tests{

	@Test
	fun nullFile_doSafeNullReferences(){
		val nullFile : File? = null
		val nullExists = nullFile?.exists()
		val nullFileNameLength = nullFile?.getName()?.length
		assertNull(nullFile)
		assertNull(nullExists)
		assertNull(nullFileNameLength)
	}

	@Test
	fun nullInteger_doElvisOperator(){
		val nullInteger : Int? = null
		assertEquals(-1, nullInteger ?: -1)
	}

	@Test
	fun castIntegerToString_safely(){
		val integer = 1
		val string = integer as? String 
		assertNull(string)
	}

}

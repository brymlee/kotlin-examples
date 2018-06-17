package brymlee

import java.util.stream.Collectors.*

fun nameFilter(nameFilter:String, names:List<String>) : List<String>{
	return names
		.stream()
		.filter{nameFilter.equals(it)}
		.collect(toList());
}

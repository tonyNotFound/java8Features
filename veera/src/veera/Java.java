package veera;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static utilities.CommonUtilities.mapDoubleWithString;
import static utilities.CommonUtilities.mapFloatWithString;
import static utilities.CommonUtilities.mapIntegerWithString;
import static utilities.CommonUtilities.mapLongWithString;
import static utilities.StreamUtilities.modifyListWithCustomMapper;

public class Java {
	public static void main(String[] args) {
		List<Integer> IntegerCollected = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
		List<Double> doubleCollected = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0).collect(Collectors.toList());
		List<Float> floatCollected = Stream.of(1.0f, 2.0f, 3.0f, 4.0f, 5.0f).collect(Collectors.toList());
		List<Long> longCollected = Stream.of(1L, 2L, 3L, 4L, 5L).collect(Collectors.toList());
		
		List<String> customMap1 = modifyListWithCustomMapper(IntegerCollected, v -> mapIntegerWithString(v));
		System.out.println("Integer Successfully Compiled ONE ==== >>> " + customMap1);
		
		List<String> customMap2 = modifyListWithCustomMapper(doubleCollected, v -> mapDoubleWithString(v));
		System.out.println("Double Successfully Compiled TWO ==== >>> " + customMap2);

		List<String> customMap3 = modifyListWithCustomMapper(floatCollected, v -> mapFloatWithString(v));
		System.out.println("Float Successfully Compiled THREE ==== >>> " + customMap3);
		
		List<String> customMap4 = modifyListWithCustomMapper(longCollected, v -> mapLongWithString(v));
		System.out.println("Long Successfully Compiled FOUR ==== >>> " + customMap4);
	}
}

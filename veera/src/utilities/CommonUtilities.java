package utilities;
import java.util.Map;
import validation.CommonValidation;

public final class CommonUtilities {
	
	public static String mapIntegerWithString(Integer number) {
		if (CommonValidation.isValidNumber(number)) {
			Map<Number, String> theMap = Map.of(1, "Veera",
					2, "Tony",
					3, "Moni",
					4, "Viki");
			return theMap.get(number);
		}
		return "";
	}
	
	public static String mapLongWithString(Long number) {
		if (CommonValidation.isValidNumber(number)) {
			Map<Long, String> theMap = Map.of(1L, "Veera",
					2L, "Tony",
					3L, "Moni",
					4L, "Viki");
			return theMap.get(number);
		}
		return "";
	}
	
	public static String mapFloatWithString(Float number) {
		if (CommonValidation.isValidNumber(number)) {
			Map<Float, String> theMap = Map.of(1.0f, "Veera",
					2.0f, "Tony",
					3.0f, "Moni",
					4.0f, "Viki");
			return theMap.get(number);
		}
		return "";
	}
	
	public static String mapDoubleWithString(Double number) {
		if (CommonValidation.isValidNumber(number)) {
			Map<Double, String> theMap = Map.of(1.0, "Veera",
					2.0, "Tony",
					3.0, "Moni",
					4.0, "Viki");
			return theMap.get(number);
		}
		return "";
	}

}

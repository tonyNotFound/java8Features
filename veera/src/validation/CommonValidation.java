package validation;
import java.util.List;
import java.util.Objects;

public final class CommonValidation {

	public static boolean isValidNumber(Number number) {
		return (number == null || ( number.intValue() <= 0 || number.longValue() <= 0L || number.doubleValue() <= 0.0 || number.floatValue() <= 0.0f )) ? false : true;
	}

	public static boolean isValidString (String string) {
		return (string == null || string.isBlank() || string.isEmpty()) ? false : true;
	}
	
	public static <T> boolean isValidData (T incomingData) {
		return Objects.nonNull(incomingData) &&
				((incomingData instanceof List<?> && (!((List<?>) incomingData).isEmpty()) && ((List<?>) incomingData).get(0) instanceof Number));
	}
	
}

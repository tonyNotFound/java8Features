package utilities;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import validation.CommonValidation;

@SuppressWarnings({ "unchecked", "rawtypes" })
public final class StreamUtilities {
	
	public static final Predicate<Object> nonNullPredicate = Objects :: nonNull;
	
	public static final Predicate<Integer> validIntegerPredicate = CommonValidation :: isValidNumber;
	
	public static final Predicate<String> validStringPrediction = CommonValidation :: isValidString;
	
	public static final <T, E> List<E> modifyListWithCustomMapper(List<T> incomingData, Function<? super T, E> mapper) {
		if (CommonValidation.isValidData(incomingData))
			return (List<E>) ((List) incomingData)
					.stream()
					.map(mapper)
					.filter(nonNullPredicate)
					.collect(Collectors.toList());
		return Collections.EMPTY_LIST;
	}
	
}

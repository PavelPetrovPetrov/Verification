import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EGNValidator {
	private Pattern pattern;

	private Matcher matcher;

	private static final String EGN_PATTERN = "[0-9]{10}$";

	public EGNValidator(){

	pattern = Pattern.compile(EGN_PATTERN);

	}

	public boolean validateEGN(final String EGN){

	matcher = pattern.matcher(EGN);

	return matcher.matches();

	}

}

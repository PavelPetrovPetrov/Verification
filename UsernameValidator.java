import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator{

	private Pattern pattern;

	private Matcher matcher;

	private static final String USERNAME_PATTERN = "[A-Za-z0-9_-]{5,20}$";

	public UsernameValidator(){

			pattern = Pattern.compile(USERNAME_PATTERN);

	}

	public boolean validateUserName(final String username){

			matcher = pattern.matcher(username);

			return matcher.matches();

	}

}
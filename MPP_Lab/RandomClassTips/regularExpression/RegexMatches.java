package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexMatches {

	public static void main(String[] args) {
		RegexMatches.regexMatches6();
	}

	public static void regexMatches1() {
		String line = "This order was placed for QT3000! OK?";
		// String pattern = "(.*)(\\d+)(.*)";
		String pattern = "(.*)(l.*)(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}
	}

	public static void regexMatches2() {
		final String REGEX = "\\bcat\\b";
		final String INPUT = "cat cat cat cattie cat";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // get a matcher object
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
			System.out.println();
		}
	}

	public static void regexMatches3() {
		final String REGEX = "foo";
		final String INPUT = "fooooooooooooooooo";
		Pattern pattern;
		Matcher matcher;

		pattern = Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);

		System.out.println("Current REGEX is: " + REGEX);
		System.out.println("Current INPUT is: " + INPUT);

		System.out.println("lookingAt(): " + matcher.lookingAt());
		System.out.println("matches(): " + matcher.matches());
	}

	public static void regexMatches4() {
		String REGEX = "dog";
		String INPUT = "The dog says meow. " + "All dogs say meow.";
		String REPLACE = "[cat]";
		Pattern p = Pattern.compile(REGEX);

		// get a matcher object
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}

	public static void regexMatches5() {
		String REGEX = "a*b";
		String INPUT = "aabfooaabfooabfoob";
		String REPLACE = "-";
		Pattern p = Pattern.compile(REGEX);

		// get a matcher object
		Matcher m = p.matcher(INPUT);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, REPLACE);
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
	}

	public static void regexMatches6() {
		String[] args = new String[2];
		args[0] = "\\bthe\\b";
		args[1] = "the quick brown fox jumpsthe thethe theover the lazy dog_*?#";
		// Convert new-line (\n) character sequences to new-line characters.
		args[1] = args[1].replaceAll("\\\\n", "\n");
		try {
			System.out.println("regex = " + args[0]);
			System.out.println("input = " + args[1]);
			Pattern p = Pattern.compile(args[0]);
			Matcher m = p.matcher(args[1]);
			while (m.find())
				System.out.println(
						"Found [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));
		} catch (PatternSyntaxException pse) {
			System.err.println("Bad regex: " + pse.getMessage());
			System.err.println("Description: " + pse.getDescription());
			System.err.println("Index: " + pse.getIndex());
			System.err.println("Incorrect pattern: " + pse.getPattern());
		}
	}
}

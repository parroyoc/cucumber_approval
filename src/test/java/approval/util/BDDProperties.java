package approval.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BDDProperties {
	static Properties properties;

	public static String get(String property) {
		try {
			if (properties == null) loadProperties();
			return properties.getProperty(property);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void loadProperties() throws IOException {
		properties = new Properties();
		InputStream input = BDDProperties.class.getClassLoader().getResourceAsStream("config.properties");
		properties.load(input);
		input.close();
	}

}

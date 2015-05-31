package approval.util;

import java.io.File;
import java.io.PrintWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BDDRecorder {
	public static final int ON_DEMAND = 1;
	public static final int NAVIGATION = 2;
	public static final int ACTION = 3;
	private static final String BASE_PATH = "BASE_PATH";
	private static String scenarioName;
	private static int level;
	private static int sequence;
	private static StringBuilder reportContents;

	public static void start(String name, int recordingLevel) {
		scenarioName = name;
		level = recordingLevel;
		sequence = 1;
		reportContents = new StringBuilder();
		createOutputFolder();
	}

	public static void stop() {
		generateIndex();
	}

	public static void snapshot(int recordingLevel, String title) {
		if (recordingLevel <= level) captureScreenshot(title);
	}

	public static void step(String step) {
		appendReportContentStep(step);
	}
	
	protected static void captureScreenshot(String title) {
		WebDriver webDriver = BDD.getWebDriver();
		if (webDriver instanceof TakesScreenshot) {
			try {
				File screenshotFile=((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
				String snapshotFileName = generateNextSnapshotFileName(title);
			    FileUtils.copyFile(screenshotFile,new File(snapshotFileName));
			    appendReportContentSnapshot(title, snapshotFileName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void appendReportContentStep(String step) {
		reportContents.append("\t<h1>" + step + "</h1>\n");
		reportContents.append("\t<hr/>\n");
	}
	
	private static void appendReportContentSnapshot(String title, String snapshotFileName) {
		reportContents.append("\t<h2>" + title + "</h2>\n");
		reportContents.append("\t<img border=\"1\" src=\"file://" + snapshotFileName + "\"/>\n");
		reportContents.append("\t<hr/>\n");
	}
	
	private static void generateIndex() {
		try {
			PrintWriter writer = new PrintWriter(generateIndexFileName(), "UTF-8");
			writer.println("<html>\n<head>\n<title>" + scenarioName + " results" + "</title>\n</head>\n");
			writer.println(reportContents);
			writer.println("</html>");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createOutputFolder() {
		File dir = new File(baseScenarioName());
		if (!dir.exists()) {
			try {
				dir.mkdir();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static String generateNextSnapshotFileName(String title) {
		return baseScenarioName() + File.separator + String.format("%03d", sequence++) + "_" + title.replace(' ', '-') + ".png";
	}

	private static String generateIndexFileName() {
		return baseScenarioName() + File.separator + "index.html";
	}
	
	private static String baseScenarioName() {
		return BDDProperties.get(BASE_PATH) + scenarioName.replace(' ', '-');
	}

}

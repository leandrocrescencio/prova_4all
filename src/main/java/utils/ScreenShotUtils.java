package utils;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;

public class ScreenShotUtils {
	
	private ScreenShotUtils() {
		throw new IllegalStateException("Utility class");
	}
	
	private static String base64Encoded = "";
	private static final Logger LOGGER = Logger.getLogger(ScreenShotUtils.class);

	public static String captureScreenShot() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BufferedImage image;
		
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		
		try {
			image = new Robot().createScreenCapture(new Rectangle(0,0,tela.width,tela.height));
			ImageIO.write(image, "PNG", baos);
			base64Encoded = Base64.getEncoder().encodeToString(baos.toByteArray());
		} catch (AWTException | IOException e) {
			LOGGER.warn(e.getMessage());
		}
		return "data:image/png;base64," + base64Encoded;
	}

}
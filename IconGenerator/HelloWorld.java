package IconGenerator;

import IconGenerator.ImageRescaling;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

public class HelloWorld {
    public static void main(String[] args) {

        ImageRescaling im = new ImageRescaling();
        File pathToFile = new File("/Users/flaviusstan/Downloads/IMG_9379.jpeg");
        try {
            Image image = ImageIO.read(pathToFile);
            BufferedImage resizedImage = im.resWidthxHeightxMultiplier(image, 5, 1);
            System.out.println(Integer.toString(resizedImage.getWidth()));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
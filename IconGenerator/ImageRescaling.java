/*
 * Copyright (C) 2019 Flavius Stan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package IconGenerator;

import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author flaviusstan
 */
public class ImageRescaling {
    

    /**
     * This method resize an image to the specific dimensions as arguments. For example,
     * to obtain a 5x5 image, x must be 5 and y must be 1 so 5x5x1 is equal to an image of 10x10.
     * To obtain an 10x10, you can do x = 5 and y=2 so 5x5x2 is equal to an image of 10x10
     * @param image The image that you want to resize
     * @param x The size of the desire image
     * @param y The multiplier size
     * @return The resized image.
     */
    public BufferedImage resWidthxHeightxMultiplier(Image image, int x, int y) {
        BufferedImage reImage = (BufferedImage) image;
        int type = reImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : reImage.getType();
        BufferedImage resizedIm = new BufferedImage(x*y, x*y, type);
        Image scaledImage = image.getScaledInstance(x*y, x*y, Image.SCALE_SMOOTH);
        resizedIm.getGraphics().drawImage(scaledImage, 0, 0, null);
        return resizedIm;
    }
}
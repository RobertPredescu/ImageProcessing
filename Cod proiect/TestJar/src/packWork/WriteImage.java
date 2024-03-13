package packWork;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WriteImage extends Image {

    private String fileExtension;

    public WriteImage(String destinationPath) {
        setFilePath(destinationPath);
    }

    // metoda de scriere a unei imaginii
    public void write(ReadImage image) throws IOException {
        ImageIO.write(image.getImg(), fileExtension, new File(getFilePath() + "." + fileExtension));
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

}

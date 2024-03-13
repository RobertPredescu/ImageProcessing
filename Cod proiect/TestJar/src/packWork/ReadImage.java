package packWork;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ReadImage extends Image {

    public ReadImage(String sourcePath) {
        setFilePath(sourcePath);
    }

    // metoda folosita pentru a obtine o imagine care trebuie citita
    public void read() throws IOException {
        setImg(ImageIO.read(new File(getFilePath())));
    }

}

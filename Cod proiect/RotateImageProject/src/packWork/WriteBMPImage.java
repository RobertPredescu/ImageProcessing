package packWork;

import java.io.IOException;

public class WriteBMPImage extends WriteImage{
    
    public WriteBMPImage(String destinationPath) {
        super(destinationPath);
        super.setFileExtension("bmp");
    }
    
    // supraincarcarea metodei write din clasa parinte prin schimbarea tipului de date al parametrului
    public void write(ReadBMPImage image) throws IOException {
        super.write(image);
    }

    @Override
    public void setFileExtension(String fileExtension) {
        throw new IllegalArgumentException("Extensia fisierului de iesire nu poate fi schimbata, este BMP");
    }
        
}

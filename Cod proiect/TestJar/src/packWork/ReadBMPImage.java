package packWork;

public class ReadBMPImage extends ReadImage {

    public ReadBMPImage(String sourcePath) throws IllegalArgumentException {
        super(sourcePath);
        if (!sourcePath.endsWith(".bmp")) {
            throw new IllegalArgumentException("Extensia fisierului de intrare trebuie sa fie BMP");
        }
    }

}

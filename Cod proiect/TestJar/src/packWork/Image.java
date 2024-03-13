package packWork;

import java.awt.image.BufferedImage;

public abstract class Image implements ImageInterface{

    private String filePath;
    private BufferedImage img;

    // getter si setter pentru atributul privat filePath care nu poate fi suprascris deoarece este apelat in constructorul claselor care mostenesc Image
    @Override
    public final String getFilePath() {
        return filePath;
    }
    
    @Override
    public final void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    // getter si setter pentru imagine
    @Override
    public BufferedImage getImg() {
        return img;
    }
    
    @Override
    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
}
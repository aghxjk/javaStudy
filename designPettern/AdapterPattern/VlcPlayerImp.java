package AdapterPattern;

/**
 * Created by zhaoyimeng on 2016/12/20.
 */
public class VlcPlayerImp implements IAdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}

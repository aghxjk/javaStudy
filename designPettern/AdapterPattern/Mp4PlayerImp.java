package AdapterPattern;

/**
 * Created by zhaoyimeng on 2016/12/20.
 */
public class Mp4PlayerImp implements IAdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name: " + fileName);
    }
}

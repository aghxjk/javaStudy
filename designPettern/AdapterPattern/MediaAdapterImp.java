package AdapterPattern;

/**
 * Created by zhaoyimeng on 2016/12/20.
 */
public class MediaAdapterImp implements IMediaPlayer{

    IAdvanceMediaPlayer advanceMediaPlayer = null;

    public MediaAdapterImp(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VlcPlayerImp();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4PlayerImp();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}

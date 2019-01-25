package AdapterPattern;

/**
 * Created by zhaoyimeng on 2016/12/20.
 */
public class AudioPlayer implements IMediaPlayer{

    MediaAdapterImp mediaAdapterImp = null;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapterImp = new MediaAdapterImp(audioType);
            mediaAdapterImp.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

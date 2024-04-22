package day10.parctice;

// Main 클래스
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.addMedia(new VideoPlayer());
        player.addMedia(new AudioPlayer());
        player.addMedia(new ImageDisplay());

        player.playAll();  // 모든 미디어 파일 재생 (각각의 play메서드 호출)
        player.pauseAll();  // 모든 미디어 파일 일시정지 (각각의 pause메서드 호출)
        player.stopAll();  // 모든 미디어 파일 스탑 (각각의 stop메서드 호출)
    }
}

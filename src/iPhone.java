public class iPhone implements MusicalPlayer, Telephone, WebBrowser{

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void nextTrack() {
        System.out.println("Skipping to the next track...");
    }

    @Override
    public void previousTrack() {
        System.out.println("Returning to the previous track...");
    }

    @Override
    public void makeCall(String contact) {
        System.out.println("Calling " + contact + "...");
    }

    @Override
    public void receiveCall(String contact) {
        System.out.println("Incoming call from " + contact + "...");
    }

    @Override
    public void endCall() {
        System.out.println("Call ended.");
    }

    @Override
    public void openPage(String url) {
        System.out.println("Opening page: " + url);
    }

    @Override
    public void search(String query) {
        System.out.println("Searching for: " + query);
    }

    @Override
    public void navigate(String direction) {
        System.out.println("Navigating " + direction + "...");
    }

}

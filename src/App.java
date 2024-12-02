public class App {
    public static void main(String[] args) throws Exception {
        iPhone myPhone = new iPhone();

    
        myPhone.play();
        myPhone.pause();
        myPhone.nextTrack();
        myPhone.previousTrack();

        
        myPhone.makeCall("John Doe");
        myPhone.receiveCall("Jane Doe");
        myPhone.endCall();

    
        myPhone.openPage("www.example.com");
        myPhone.search("iPhone features");
        myPhone.navigate("backward");
    }
}

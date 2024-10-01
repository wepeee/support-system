
public class App {

    public static void main(String[] args) throws Exception {
        inputreader inputreader = new inputreader();
        responder responder = new responder();
        System.out.println("Welcome to our Support System !");
        System.out.println("Coba ceritain masalahmu...");
        while (true) {
            inputreader.getInput();
            if (inputreader.getBye()) {
                System.out.println("See uu next time :>");
                break;
            }
            responder.getResponse();
        }
    }
}

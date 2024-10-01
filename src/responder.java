
import java.util.Random;

public class responder {

    public String[] response = {
        "its okayyy, coba ceritakan lagi :>",
        "ohh begituu, mungkin ada cerita lain?",
        "aku ikut sedih..., coba ceritain masalah kamu yang lain :>",
        "kamu gapapa kan?, coba ceritakan lagi",
        "tapi emang begitu sih..., coba ceritain lagi yang lain dong !!"
    };

    public void getResponse() {
        Random random = new Random();
        System.out.println(response[random.nextInt(response.length)]);
    }
}

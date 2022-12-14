import model.Envelope;
import model.Gift;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Mikołaj pakuje prezenty w koperty. Zakupił trzy rozmiary: 10x15, 20x30, 30x30.
 * Dopasuj najmniejszą możliwą kopertę do każdego prezentu z listy.
 * Wypisz na ekranie, która koperta najlepiej pasuje do każdego prezentu.
 */
public class Day11_ChooseEnvelope {

    public static void main(String[] args) {
        List<Gift> gifts = prepareGifts();

        Envelope small = new Envelope(10, 15);
        Envelope medium = new Envelope(20, 30);
        Envelope big = new Envelope(30, 30);

        // TODO: Write code which help to choose one of the envelopes (small, medium or big) for each gift

        Map<Gift, Envelope> giftEnvelopeMap = new HashMap<>();

        gifts.forEach(gift -> {
            if (gift.getWidth() <= small.getWidth() && gift.getHeight() <= small.getHeight()) {
                giftEnvelopeMap.put(gift, small);
            } else if (gift.getWidth() <= medium.getWidth() && gift.getHeight() <= medium.getHeight()) {
                giftEnvelopeMap.put(gift, medium);
            } else if (gift.getWidth() <= big.getWidth() && gift.getHeight() <= big.getHeight()) {
                giftEnvelopeMap.put(gift, big);
            }
        });

        System.out.println(giftEnvelopeMap);
    }

    private static List<Gift> prepareGifts() {
        return List.of(
                new Gift("Parfum", 12, 30),
                new Gift("Socks", 10, 10),
                new Gift("Book", 30, 25),
                new Gift("Clock", 15, 15),
                new Gift("Wallet", 5, 10)
        );
    }
}

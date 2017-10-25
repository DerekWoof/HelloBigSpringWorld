package MyFirstSpringController.adapter.persistance;

import MyFirstSpringController.domain.port.offering.demand.TwitterAccessPort;
import MyFirstSpringController.domain.view.TwitterView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InMemoryTwitterRepository implements TwitterAccessPort {

    private static List<Twitter> twitterList = new ArrayList<>();

    static {
        Twitter twitter16 = new Twitter(16L, "HE SCORED WONDERFUL GOAL @EDEN_HAZARD17", LocalDateTime.of(2017, 10, 11, 20, 55), "user123", "public", "127.32.32.23");
        twitterList.add(twitter16);
        Twitter twitter35 = new Twitter(35L, "Kasztan to najlepszy wykładowca.", LocalDateTime.now(), "user17",
                "public", "192.1.1.0");
        twitterList.add(twitter35);
        Twitter twitter1 = new Twitter(1l, "JINGLE BELLS, LOL", LocalDateTime.now(), "Mal", "public", "31.179.144.76");
        twitterList.add(twitter1);
        Twitter twitter2 = new Twitter(2L, "Can you hear me now?", LocalDateTime.of(2017, 10, 25, 21, 30), "@barkom", "public", "69.666.34.12");
        twitterList.add(twitter2);
        Twitter twitter4 = new Twitter(4L, "jestem twitterem numer 4", LocalDateTime.of(2017, 04, 23, 06, 24), "34", "public", "12.123.250.43");
        twitterList.add(twitter4);
        Twitter twitter7 = new Twitter(7L, "make some noise!", LocalDateTime.of(2017, 10, 11, 20, 57), "user7", "public", "123.34.34.8");
        twitterList.add(twitter7);
        Twitter twitter6 = new Twitter(6L, "My ass hurts so bad", LocalDateTime.now(), "93231", "public", "127.0.0.1");
        twitterList.add(twitter6);
        Twitter twitter13 = new Twitter(13L, "WHAT'S UP?", LocalDateTime.of(2017, 10, 11, 20, 20), "@16", "public", "195.177.56.72");
        twitterList.add(twitter13);
        Twitter twitter5 = new Twitter(5L, "Znów przegrałem...", LocalDateTime.of(2017, 10, 20, 0, 1, 0), "@Krzy", "public", "143.12.234.213");
        twitterList.add(twitter5);
        Twitter twitter100 = new Twitter(100L, "WHAT A BEATEFULL TIME WE SPENT", LocalDateTime.of(2017, 10, 19, 19, 57), "user1", "public", "124.33.34.6");
        twitterList.add(twitter100);
        Twitter twitter11 = new Twitter(11L, "And he said: my name is Stoneheart", LocalDateTime.of(2017, 10, 24, 21, 50), "user120", "public", "127.33.31.11");
        twitterList.add(twitter11);
        Twitter twitter12 = new Twitter(12L, "hey", LocalDateTime.of(2017, 11, 25, 21, 30), "user450", "public", "69.666.34.12");
        twitterList.add(twitter12);
        Twitter twitter9 = new Twitter(9L, "x", LocalDateTime.now(), "666", "public", "255.255.255.255");
        twitterList.add(twitter9);
        Twitter twitter10 = new Twitter(10l, "Glory, glory, ManU", LocalDateTime.of(2017, 10, 11, 19, 55), "10", "public", "10.01.0.0.0");
        twitterList.add(twitter10);
    }


    @Override
    public List<TwitterView> getTwitters(Integer packetSize) {
        return null;
    }
}

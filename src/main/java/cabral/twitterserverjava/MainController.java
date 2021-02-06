package cabral.twitterserverjava;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {

    List<TweetDto> tweets;

    MainController() {
        tweets = new ArrayList<TweetDto>(Arrays.asList(
                new TweetDto("Andre", "No matter how beautiful the sunset, it saddened her knowing she was one day older.", "2/4/21", 10, 23, 1),
                new TweetDto("Andre", "She wondered what his eyes were saying beneath his mirrored sunglasses.", "2/4/21", 134, 5, 83),
                new TweetDto("Andre", "He was an introvert that extroverts seemed to love.", "2/4/21", 234, 92, 99),
                new TweetDto("Andre", "They were excited to see their first sloth.", "2/4/21", 1546, 3, 2),
                new TweetDto("Andre", "Tom got a small piece of pie.", "2/4/21", 145, 82, 7),
                new TweetDto("Andre", "The light that burns twice as bright burns half as long.", "2/4/21", 1, 2, 3),
                new TweetDto("Andre", "Today we gathered moss for my uncle's wedding.", "2/4/21", 6, 5, 4),
                new TweetDto("Andre", "Poison ivy grew through the fence they said was impenetrable.", "2/4/21", 17, 8, 91),
                new TweetDto("Andre", "If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", "2/4/21", 1010, 1123, 121)
        ));
    }

    @CrossOrigin
    @GetMapping("/api/tweets")
    public List<TweetDto> getAllTweets() {
        return tweets;
    }
}

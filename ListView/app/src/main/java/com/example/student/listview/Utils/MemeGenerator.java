package com.example.student.listview.Utils;

import com.example.student.listview.Models.Meme;
import com.example.student.listview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2/14/15.
 */
public class MemeGenerator {

    static final String name[]={"Cereal Guy", "Challenge Accepted", "Everything Went Better Than Expected", "Forever Alone", "Hipster Cat", "Poker Face", "Me Gusta", "Troll Face", "LOL (LOL meme)", "Mother of God"};

    static final String desc[]={"A guy who always eats cereal, pukes out later",
            "Any challenge is accepted, don't worry he can accomplish it in a blink of an eye. Give him any challenge, that's no problem for this guy. Because this guy can do anything.",
            "You didn't expect it to happen but its better than what you have expected",
            "Perfect meme for single people during valentines",
            "I'm a cat who got the moves. A cat so hipster. I got the swag yoh!",
            "Look at my face, you can't ready my mind bro. My face speaks nothing of what is running in my head. Beware dude!",
            "Me gusta gusta baby, I like that",
            "Don't be serious, here come the troll",
            "Type this when you laughing out to much, lazy ass does this in texts and chats",
            "Mother of God, WTH too IMBA! IMBA!  IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA!  IMBA! IMBA! IMBA! " +
                    "IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! IMBA! "};

    static  final Integer[] img={R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10};

    public static List<Meme> generateMemes()
    {
        ArrayList<Meme> memes = new ArrayList<Meme>();

        for(int x = 0; x < 10 ; x++)
        {
            Meme meme = new Meme();

            meme.setName(name[x]);
            meme.setDescription(desc[x]);
            meme.setImage_ref(img[x]);

            memes.add(meme);

        }


        return memes;
    }

}

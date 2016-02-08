import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by katie on 2/8/16.
 */
public class FaceCollectionSpec {
    FaceCollection emoji = new FaceCollection();
    String expected1 = "｡◕‿◕｡";
    String actual1 = emoji.getEmojis(0);

    @Test
    public void testFaceCollection() {
        assertEquals("Testing the first face", expected1, actual1);
    }


    SequenceGenerator testsg = new SequenceGenerator();
    String expected = "｡◕‿◕｡ ( ^..^)ﾉ ʕ⁎̯͡⁎ʔ༄ ˁ˙͠˟˙ˀ \n" +
            " ⊂(・(ェ)・)⊃ ᕦ(ò_óˇ)ᕤ ／人◕ ‿‿ ◕人＼  (￣^￣)ゞ\n" +
            " （〜^∇^)〜 (=^‥^=) ( ^-^)_旦”” ╰( ´・ω・)つ──☆✿✿✿✿✿✿\n" +
            " ฅ^•ﻌ•^ฅ ꒰⑅•ᴗ•⑅꒱ ←～（o ｀▽´ )oΨ (ﾉ◕ヮ◕)ﾉ*:・ﾟ✧\n" +
            " (ｏ・_・)ノ”(ᴗ_ ᴗ。) (∩｀-´)⊃━☆ﾟ.*･｡ﾟ ᕦ(ò_óˇ)ᕤ\n" +
            " ༼ つ ◕_◕ ༽つ (╯°□°）╯︵ ┻━┻ ಠ_ಠ (⊙﹏⊙✿) ♪(┌・。・)┌\n" +
            " ~(˘▾˘)~ (✖╭╮✖) (U・x・U) ಠﭛಠ (ﾉ´ヮ´)ﾉ*:･ﾟ✧  ٩(^ᴗ^)۶ ";
    String actual = testsg.createSequence(0, 30, "all", "faces");

    @Test
    public void testFaceCreateSequence() {
        assertEquals("Testing array of faces", expected, actual);
    }

    String expected2 = "( ^..^)ﾉ ˁ˙͠˟˙ˀ \n" +
            " ᕦ(ò_óˇ)ᕤ  (￣^￣)ゞ\n" +
            " (=^‥^=) ╰( ´・ω・)つ──☆✿✿✿✿✿✿\n" +
            " ꒰⑅•ᴗ•⑅꒱ (ﾉ◕ヮ◕)ﾉ*:・ﾟ✧\n" +
            " (∩｀-´)⊃━☆ﾟ.*･｡ﾟ ༼ つ ◕_◕ ༽つ ಠ_ಠ ♪(┌・。・)┌\n" +
            " (✖╭╮✖) ಠﭛಠ ٩(^ᴗ^)۶ ";
    String actual2 = testsg.createSequence(0, 30, "odd", "faces");

    @Test
    public void testOddFaces() {

        assertEquals("Testing odd faces", expected2, actual2);
    }
}

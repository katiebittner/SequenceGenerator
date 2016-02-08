import java.util.*;


/**
 * Created by katie on 2/8/16.
 */
public class FaceCollection {
    private ArrayList<String> emojis = new ArrayList<String>(Arrays.asList("｡◕‿◕｡", "( ^..^)ﾉ", "ʕ⁎̯͡⁎ʔ༄", "ˁ˙͠˟˙ˀ \n",
            "⊂(・(ェ)・)⊃", "ᕦ(ò_óˇ)ᕤ", "／人◕ ‿‿ ◕人＼", " (￣^￣)ゞ\n",
            "（〜^∇^)〜", "(=^‥^=)", "( ^-^)_旦””", "╰( ´・ω・)つ──☆✿✿✿✿✿✿\n",
            "ฅ^•ﻌ•^ฅ", "꒰⑅•ᴗ•⑅꒱", "←～（o ｀▽´ )oΨ", "(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧\n",
            "(ｏ・_・)ノ”(ᴗ_ ᴗ。)", "(∩｀-´)⊃━☆ﾟ.*･｡ﾟ", "ᕦ(ò_óˇ)ᕤ\n",
            "༼ つ ◕_◕ ༽つ", "(╯°□°）╯︵ ┻━┻", "ಠ_ಠ", "(⊙﹏⊙✿)", "♪(┌・。・)┌\n",
            "~(˘▾˘)~", "(✖╭╮✖)", "(U・x・U)", "ಠﭛಠ", "(ﾉ´ヮ´)ﾉ*:･ﾟ✧ ", "٩(^ᴗ^)۶", "(/)(;,,;)(/)\n"));

    public String getEmojis(int index) {
        return emojis.get(index);
    }

    public static void main(String[] args) {
        FaceCollection faces = new FaceCollection();

    }


}

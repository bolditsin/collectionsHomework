package collectionsHomework;

import java.util.*;


public class wordsToCount {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("credo", "in", "deum", "patrem", "omnipotentem", "creatorem", "caeli", "et", "terrae", "et", "in", "iesum", "christum", "filium", "eius", "unicum", "dominum", "nostrum", "qui", "conceptus", "de", "spiritu", "sancto", "natus", "ex", "maria", "virgine", "passus", "sub", "pontio", "pilato", "crucifixus", "mortuus", "et", "sepultus", "descendit", "ad", "inferos", "tertia", "die", "resurrexit", "a", "mortuis", "ascendit", "ad", "caelos", "sedet", "ad", "dexteram", "dei", "patris", "omnipotentis", "inde", "venturus", "est", "iudicare", "vivos", "et", "mortuos", "credo", "in", "spiritum", "sanctum", "sanctam", "ecclesiam", "catholicam", "sanctorum", "communionem", "remissionem", "peccatorum", "carnis", "resurrectionem", "vitam", "aeternam", "amen");
        Set<String> uniWords = new HashSet<>(words);

        System.out.println("Молитва");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(uniWords.toString());
        System.out.println("Количество повторений слова");
        for (String key : uniWords) {
            System.out.println(key + ": " + Collections.frequency(words, key));

        }
    }
}
package dictionary;

public class Main {

    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary();
        s.add("apina", "monkey");
        s.add("tietokone", "computer");
        s.translate("ihminen");

    }
}

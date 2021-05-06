package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author pedromaia
 */
public class SaveableDictionary {

    private ArrayList<Word> translations;
    private String file;

    public SaveableDictionary() {
        this.translations = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        ArrayList<String> fromFile = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> fromFile.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        fromFile.stream()
                .map(value -> value.split(":"))
                .forEach(value -> translations.add(new Word(value[0], value[1])));
        return true;
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (Word word : translations) {
                writer.println(word.getWord() + ":" + word.getTranslation());
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!translations.contains(new Word(words, translation))) {
            translations.add(new Word(words, translation));
        }
    }

    public String translate(String word) {
        Word translate = compare(word);
        if (translate == null) {
            return null;
        }
        if (translate.getTranslation().equals(word)) {
            return translate.getWord();
        } else if (translate.getWord().equals(word)) {
            return translate.getTranslation();
        }
        return null;
    }

    public void delete(String word) {
        Word toDelete = compare(word);
        translations.remove(toDelete);
    }

    public Word compare(String word) {
        for (int i = 0; i < translations.size(); i++) {
            Word query = translations.get(i);
            if (query.getTranslation().equals(word) || query.getWord().equals(word)) {
                return query;
            }

        }
        return null;
    }
}

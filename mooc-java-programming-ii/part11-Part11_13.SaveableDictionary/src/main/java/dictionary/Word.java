package dictionary;

import java.util.Objects;

/**
 *
 * @author pedromaia
 */
public class Word {
    private String word;
    private String translation;
    
    public Word(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word + " - " + translation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.word);
        hash = 13 * hash + Objects.hashCode(this.translation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Word other = (Word) obj;
        if (!Objects.equals(this.word, other.word)) {
            return false;
        }
        if (!Objects.equals(this.translation, other.translation)) {
            return false;
        }
        return true;
    }
    
    
}

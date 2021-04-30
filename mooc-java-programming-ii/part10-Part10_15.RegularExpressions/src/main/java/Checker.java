

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        if(string.matches("mon")) return true;
        if(string.matches("tue")) return true;
        if(string.matches("wed")) return true;
        if(string.matches("thu")) return true;
        if(string.matches("fri")) return true;
        if(string.matches("sat")) return true;
        if(string.matches("sun")) return true;
        return false;
    }
    
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
    
    public boolean timeOfDay(String string) {
        if(string.matches("[0-1][1-9]:[0-5][0-9]:[0-5][0-9]")) return true;
        return string.matches("2[0-3]:[0-5][0-9]:[0-5][0-9]");
    }
}

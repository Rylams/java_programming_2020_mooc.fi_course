
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String teamc = scan.nextLine();
        ArrayList<Match> records = readRecordsFromFile(file, teamc);
        String row = games(file, teamc);
        String[] parts = row.split(",");
        int games = Integer.valueOf(parts[0]);
        int win = Integer.valueOf(parts[1]);
        int loss = Integer.valueOf(parts[2]);
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }

    public static ArrayList<Match> readRecordsFromFile(String file, String teamc) {
        ArrayList<Match> matchs = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                String[] parts = row.split(",");
                String team = parts[0];
                String visiTeam = parts[1];
                int tPoints = Integer.valueOf(parts[2]);
                int vPoints = Integer.valueOf(parts[3]);
                matchs.add(new Match(team, visiTeam, tPoints, vPoints));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return matchs;
    }
    
    public static String games(String file, String teamc) {
        int games = 0 ;
        int win = 0;
        int loss = 0;
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                String[] parts = row.split(",");
                String team = parts[0];
                String visiTeam = parts[1];
                int tPoints = Integer.valueOf(parts[2]);
                int vPoints = Integer.valueOf(parts[3]);
                if (teamc.equals(team)) {
                    games++;
                    if (tPoints > vPoints) {
                        win++;
                    } else if (vPoints > tPoints) {
                        loss++;
                    }
                } else if (teamc.equals(visiTeam)) {
                    games++;
                    if (vPoints > tPoints) {
                        win++;
                    } else if (tPoints > vPoints) {
                        loss++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return games + "," + win + "," + loss;
    }
}

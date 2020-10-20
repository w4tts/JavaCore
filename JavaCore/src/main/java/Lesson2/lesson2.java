package Lesson2;

import java.util.Scanner;

public class lesson2 {
    // Реализация треугольника Флойда
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = scanner.nextInt();
        int num = 1;
        for(int x = 1; x <= row; x++){
            for (int y = 1; y <= x; y++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}


enum Artist{
    Oasis("Britpop"),
    TheBeatles("Rock"),
    TheCure("Post-punk"),
    Burial("Dubstep");

    private String genre;

    Artist(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }
}

class lesson2_enum{
    public static void main(String[] args) {
        System.out.println(Artist.Oasis.getGenre());
    }
}

class SwichTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter artist name: ");
        String Artist = scanner.nextLine();
        String genre;
        switch (Artist){
            case "Oasis":
                genre = "Britpop";
                break;
            case "TheBeatles":
                genre = "Rock";
                break;
            case "TheCure":
                genre = "Post-punk";
                break;
            case "Burial":
                genre = "Dubstep";
                break;
            default:
                genre = "Not Found";
                break;
        }
        System.out.println(genre);
        }
    }

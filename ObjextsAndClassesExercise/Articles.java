package ObjextsAndClassesExercise;

import java.util.Scanner;

public class Articles {
    static class Article{
        String title;
        String content;
        String author;
        Article(String title,String content,String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }
        void edit(String newContent){
            this.content = newContent;
        }
        void changeAuthor(String newAuthor){
            this.author = newAuthor;
        }
        void rename(String newTitle){
            this.title = newTitle;
        }
        String getInfo(){
            return title + " - " + content + ": " + author;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");
        Article article = new Article(input[0],input[1],input[2]);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++){
            String[] command = scan.nextLine().split("\\s+");
            if(command[0].equals("Edit:")){
                article.edit(command[1] + " " + command[2]);
            } else if (command[0].equals("ChangeAuthor:")){
                article.changeAuthor(command[1] + " " + command[2]);
            } else if (command[0].equals("Rename:")) {
                article.rename(command[1] + " " + command[2]);
            }
        }
        System.out.println(article.getInfo());
    }
}

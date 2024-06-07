import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Post {
    private int id;
    private String title;
    private String content;
    private String[] tags;
    private String difficultyLevel;
    private String urgencyLevel;
    private String[] difficultyLevels = {"Very Difficult", "Difficult", "Easy"};
    private String[] urgencyLevels = {"Immediately Needed", "Highly Needed", "Ordinary"};
    private ArrayList<String> comments;

    // Constructor to initialize a Post object
    public Post(int id, String title, String content, String[] tags, String difficultyLevel, String urgencyLevel, ArrayList<String> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.difficultyLevel = difficultyLevel;
        this.urgencyLevel = urgencyLevel;
        this.comments = comments;
    }

    // Method to add a post after validating all fields
    public boolean addPost() throws IOException {
        if (!validateTitle()) {
            return false;
        }

        if (!validateContent()) {
            return false;
        }

        if (!validateTags()) {
            return false;
        }

        if (!validateDifficultyLevel()) {
            return false;
        }

        if (!validateUrgencyLevel()) {
            return false;
        }

        // Writing the post details to a file if all validations pass
        try (FileWriter fw = new FileWriter("post.txt", true);
             PrintWriter out = new PrintWriter(fw)) {
            out.println("ID: " + this.id);
            out.println("Title: " + this.title);
            out.println("Content: " + this.content);
            for (int i = 0; i < this.tags.length; i++) {
                out.println("Tag" + (i + 1) + ": " + this.tags[i]);
            }
            out.println("DifficultyLevel: " + this.difficultyLevel);
            out.println("UrgencyLevel: " + this.urgencyLevel);
        }

        return true;
    }

    // Method to add comments to a post after validating all comments
    public boolean addComment() throws IOException {
        if (!validateCommentContent()) {
            return false;
        }

        if (!validateComments()) {
            return false;
        }

        // Writing the comments to a file if all validations pass
        try (FileWriter fw = new FileWriter("comment.txt", true);
             PrintWriter out = new PrintWriter(fw)) {
            out.println("ID: " + this.id);
            for (int i = 0; i < this.comments.size(); i++) {
                out.println("Comment" + (i + 1) + ": " + this.comments.get(i));
            }
            out.println("DifficultyLevel: " + this.difficultyLevel);
            out.println("UrgencyLevel: " + this.urgencyLevel);
        }

        return true;
    }

    // Validation method for the title
    public boolean validateTitle() {
        if (this.title.length() < 10 || this.title.length() > 250) {
            return false;
        }

        for (int i = 0; i < 5; i++) {
            if (!Character.isLetter(this.title.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // Validation method for the content
    public boolean validateContent() {
        return this.content.length() >= 250;
    }

    // Validation method for the tags
    public boolean validateTags() {
        if (this.tags.length < 2 || this.tags.length > 5) {
            return false;
        }

        for (String tag : this.tags) {
            if (tag.length() < 2 || tag.length() > 10) {
                return false;
            }

            for (char c : tag.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    return false;
                }
            }
        }

        return true;
    }

    // Validation method for the difficulty level
    public boolean validateDifficultyLevel() {
        if (this.difficultyLevel.equals(difficultyLevels[2]) && this.tags.length > 3) {
            return false;
        }

        if ((this.difficultyLevel.equals(difficultyLevels[0]) || this.difficultyLevel.equals(difficultyLevels[1])) && this.content.length() < 300) {
            return false;
        }

        return true;
    }

    // Validation method for the urgency level
    public boolean validateUrgencyLevel() {
        if (this.difficultyLevel.equals(difficultyLevels[2]) && (this.urgencyLevel.equals(urgencyLevels[0]) || this.urgencyLevel.equals(urgencyLevels[1]))) {
            return false;
        }

        if ((this.difficultyLevel.equals(difficultyLevels[0]) || this.difficultyLevel.equals(difficultyLevels[1])) && this.urgencyLevel.equals(urgencyLevels[2])) {
            return false;
        }

        return true;
    }

    // Validation method for the content of comments
    public boolean validateCommentContent() {
        for (String comment : this.comments) {
            String[] words = comment.split(" ");
            if (words.length < 4 || words.length > 10) {
                return false;
            }

            if (!Character.isUpperCase(words[0].charAt(0))) {
                return false;
            }
        }

        return true;
    }

    // Validation method for the comments array
    public boolean validateComments() {
        if (this.comments.size() < 0 || this.comments.size() > 5) {
            return false;
        }

        if ((this.difficultyLevel.equals(difficultyLevels[2]) || this.urgencyLevel.equals(urgencyLevels[2])) && this.comments.size() > 3) {
            return false;
        }

        return true;
    }
}

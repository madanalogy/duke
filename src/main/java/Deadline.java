import java.util.Date;
/**
 * Represents a Deadline Task
 */
public class Deadline extends Task {
    private Date details;

    Deadline(String description, Date details) {
        super(description);
        this.details = details;
    }

    Deadline(String description, Date details, boolean done) {
        super(description, done);
        this.details = details;
    }

    @Override
    public String toString() {
        return "[D][" + getStatusIcon() + "] " + description + " (by: " + details + ")";
    }

    @Override
    String store(){
        return "D|" + getStatus() + "|" + description + "|" + details;
    }
}
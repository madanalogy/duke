package duke.task;

import java.util.Date;

/**
 * Represents an Event Task
 */
public class EventTask extends Task {
    private Date details;

    public EventTask(String description, Date details) {
        super(description);
        this.details = details;
    }

    public EventTask(String description, Date details, boolean done) {
        super(description, done);
        this.details = details;
    }

    @Override
    public String toString() {
        return "[E][" + getStatusIcon() + "] " + description + " (at: " + details + ")";
    }

    @Override
    public String store() {
        return "E|" + getStatus() + "|" + description + "|" + details;
    }
}
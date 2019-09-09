package duke.io;

import duke.task.TaskList;

import java.util.Scanner;

/**
 * User Interface for Duke.
 */
public class Ui {
    private Scanner scanner;

    private StringBuilder dukeOut;

    /**
     * Constructor creates new scanner to read System-in.
     */
    public Ui() {
        scanner = new Scanner(System.in);
        dukeOut = new StringBuilder();
        showLine();
        out("Hello! I'm Duke");
    }

    public String read() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }

    public void out(String output) {
        assert output != null : "Empty Output";
        dukeOut.append(output).append("\n");
    }

    public StringBuilder getDukeOut() {
        return dukeOut;
    }

    public void clear() {
        dukeOut = new StringBuilder();
    }

    public void showLine() {
        //out("================================");
    }

    /**
     * Prints out list of tasks.
     * @param taskList List of tasks
     */
    public void list(TaskList taskList) {
        if (taskList.size() == 0) {
            out("List is empty!");
        } else {
            out("Here are the tasks in your list:");
            for (int i = 0; i < taskList.size(); i++) {
                out((i + 1) + "." + taskList.get(i));
            }
        }
    }
}

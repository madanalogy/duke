package duke.command;

import duke.io.Storage;
import duke.io.Ui;
import duke.task.TaskList;
import duke.task.TodoTask;

import java.text.ParseException;

/**
 * Represents an AddCommand, execution creates a new TodoTask.
 */
public class AddCommand extends Command {
    private String input;

    public AddCommand(String input) {
        this.input = input;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws ParseException {
        taskList.add(new TodoTask(input.trim()));
        ui.out("Got it. I've added this task:");
        ui.out(taskList.get(taskList.size() - 1).toString());
        ui.out("Now you have " + taskList.size() + " tasks in the list.");
    }
}

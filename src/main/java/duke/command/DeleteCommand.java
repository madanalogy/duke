package duke.command;

import duke.io.Parser;
import duke.io.Storage;
import duke.io.Ui;
import duke.task.TaskList;

/**
 * Represents a delete command, execution removes desired task from list.
 */
public class DeleteCommand extends Command {
    private String input;

    public DeleteCommand(String input) {
        this.input = input;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws NumberFormatException {
        int value = Parser.getIndex(input, taskList.size());
        assert value >= 0 : "Negative Index";
        ui.out("Noted. I've removed this task:");
        ui.out(taskList.get(value - 1).toString());
        taskList.remove(value - 1);
        ui.out("Now you have " + taskList.size() + " tasks in the list.");
    }
}

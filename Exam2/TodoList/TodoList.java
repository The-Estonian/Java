import java.util.StringJoiner;

public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count;

    public TodoList() {

    }

    public TodoList(int cap) {
        this.tasks = new Task[cap];
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i] == null) {
                this.tasks[i] = newTask;
                break;
            }
        }
    }

    public void setStatus(int index, TaskStatus status) {
        if (this.tasks.length > index) {
            this.tasks[index].setStatus(status);
        }
    }

    public void setDescription(int index, String newDescription) {
        if (this.tasks.length > index) {
            this.tasks[index].setDescription(newDescription);
        }
    }

    public void displayTasks() {
        StringJoiner returnString = new StringJoiner("\n");
        returnString.add("Tasks:");
        for (Task task : this.tasks) {
            if (task != null) {
                returnString.add(String.format("%-34s| %s", task.getDescription(), task.getStatus()));
            }
        }
        System.out.println(returnString.toString());
    }
}

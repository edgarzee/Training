package java_training.ppsix;

public class Task implements Priority, Complexity, Comparable<Task>{

    private String taskName;
    private int priority;
    private int complexity;

    public Task(String taskName){
        this.taskName = taskName;
        this.priority = 0; //default priority is set to 0
        this.complexity = 0; //default complexity is set to 0
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }


    @Override
    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    @Override
    public int getComplexity() {
        return complexity;
    }

    @Override
    public int compareTo(Task otherTask) {
        return Integer.compare(this.priority, otherTask.priority);
    }

    public String getTaskName(){
        return taskName;
    }
}

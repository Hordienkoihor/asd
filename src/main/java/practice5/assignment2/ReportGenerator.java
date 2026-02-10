package practice5.assignment2;

public abstract class ReportGenerator {
    public final void generate() {
        System.out.println("Generating report");
        fetchData();
        loadSomething();
    }

    protected abstract void fetchData();
    protected abstract void loadSomething();
}

package practice5.assignment2;

public class DailyReport extends ReportGenerator{
    @Override
    protected void fetchData() {
        System.out.println("Fetching data (daily report)");
    }

    @Override
    protected void loadSomething() {
        System.out.println("Loading something (daily report)");
    }
}

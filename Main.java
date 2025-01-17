public class Main {
    public static void main(String[] args) {
        String eventName = System.getenv("GITHUB_EVENT_NAME");
        String actionMessage = "GitHub Action triggered for event: " + eventName;

        System.out.println(actionMessage);
    }
}


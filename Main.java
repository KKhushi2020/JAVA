public class Main {
    public static void main(String[] args) {
        try {
            String apiUrl = "https://v6.vbb.transport.rest/locations?query=berlin";
            String json = APIUtility.fetchJSON(apiUrl);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

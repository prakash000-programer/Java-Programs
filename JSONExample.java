import org.json.JSONArray;

public class JSONExample {
    public static void main(String[] args) {
        // Example JSON string representing an array of objects
        String input = "[{\"name\":\"Alice\",\"age\":25},{\"name\":\"Bob\",\"age\":30}]";

        // Creating a JSONArray from the input string
        JSONArray jsonArray = new JSONArray(input);

        // Loop through the JSONArray and print each element
        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.getJSONObject(i).toString());
        }
    }
}

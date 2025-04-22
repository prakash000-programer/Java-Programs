import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSON_Array_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a JSON array (e.g., [{\"name\":\"Alice\",\"age\":25},{\"name\":\"Bob\",\"age\":30}]):");
        String input = scanner.nextLine();

        try {
            JSONArray jsonArray = new JSONArray(input);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                String name = obj.optString("name","N/A");
                int age = obj.optInt("age", -1);

                System.out.println("Name: " + name + ", Age: " + age);
            }

        } catch (Exception e) {
            System.out.println("Invalid JSON input: " + e.getMessage());
        }

        scanner.close();
    }
}

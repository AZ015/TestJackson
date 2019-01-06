import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

public class Serialization {
    public static void main(String[] args) {

        try {

            Person person = new Person("Victor", "Ivanov",25, 178, 78.3, Gender.MAN, new Date());
            StringWriter writer = new StringWriter();
            //Object Jackson
            ObjectMapper mapper = new ObjectMapper();
            //Serialization (where, what)
            mapper.writeValue(writer, person);
            String result = writer.toString();
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

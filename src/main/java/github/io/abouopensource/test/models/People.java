package github.io.abouopensource.test.models;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    int id;
    String lastName;
    String firstName;
    LocalDate birhtday;
}

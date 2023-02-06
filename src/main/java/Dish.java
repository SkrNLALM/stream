import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
@Data
@AllArgsConstructor
public class Dish
{
  private String name;
  private boolean vegetarian;
  private int calories;
  private Type type;

}

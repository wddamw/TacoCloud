package tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @program: TacoCloud
 * @description: Taco实体类
 * @author: wjk
 * @create: 2020-04-17 17:41
 */
@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name  must be at least 5 characters long")
    private String name;
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
}
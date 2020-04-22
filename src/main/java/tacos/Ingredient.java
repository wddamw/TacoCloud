package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @program: TacoCloud
 * @description: taco配料
 * @author: wjk
 * @create: 2020-04-17 15:55
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
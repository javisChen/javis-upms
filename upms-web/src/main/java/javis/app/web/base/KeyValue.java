package javis.app.web.base;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class KeyValue {

    private Integer value;
    private String text;

}

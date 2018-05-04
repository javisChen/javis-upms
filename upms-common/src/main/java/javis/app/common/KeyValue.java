package javis.app.common;

/**
 * @author JavisChen
 * @desc KeyValue
 * @date 2018-01-02
 * @time 下午8:50
 */
public class KeyValue {

    private Integer value;
    private String text;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public KeyValue(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

    public KeyValue(Integer value) {
        this.value = value;
    }

    public KeyValue() {
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "value=" + value +
                ", text='" + text + '\'' +
                '}';
    }
}

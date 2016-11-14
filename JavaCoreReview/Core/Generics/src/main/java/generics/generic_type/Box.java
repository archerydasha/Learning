package generics.generic_type;

/**
 * Created by Dasha on 9/12/2016.
 */
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

package ResponseClass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookResponse {

    @JsonProperty("Msg")

    private String msg;

    @JsonProperty("ID")
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String ID) {
        this.id = ID;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}

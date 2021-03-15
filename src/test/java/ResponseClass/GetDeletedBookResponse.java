package ResponseClass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetDeletedBookResponse {
    @JsonProperty("msg")
    private String msg;
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }


}


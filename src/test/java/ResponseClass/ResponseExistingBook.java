package ResponseClass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseExistingBook {

    /*
    Add Book operation failed, looks like the book already exists
 */

        @JsonProperty("msg")
        private String msg;
        public String getMsg() {
            return msg;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }



    }

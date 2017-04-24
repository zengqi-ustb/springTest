package hello;

import org.springframework.stereotype.Component;

/**
 * Created by qizeng on 2017/4/24.
 */
@Component
public class MessageService1 implements MessageService{
    public String getMessage() {
        return "service 1";
    }
}

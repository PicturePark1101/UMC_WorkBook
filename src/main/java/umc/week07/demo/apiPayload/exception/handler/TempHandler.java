package umc.week07.demo.apiPayload.exception.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc.week07.demo.apiPayload.code.BaseErrorCode;
import umc.week07.demo.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
        System.out.println("errorCode = " + errorCode);
    }
}

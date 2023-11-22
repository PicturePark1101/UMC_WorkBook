package umc.week07.demo.service.TempService;

import umc.week07.demo.apiPayload.code.status.ErrorStatus;
import umc.week07.demo.apiPayload.exception.handler.TempHandler;

public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}

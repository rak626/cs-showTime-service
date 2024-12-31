package com.crowdseats.showTime;

import com.crowdseats.framework.common.Response;
import com.crowdseats.framework.common.schema.event.EventRequest;
import com.crowdseats.framework.common.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/showtime")
@RequiredArgsConstructor
public class ShowTimeController {

    private final ShowTimeService showTimeService;

    @PostMapping("/create")
    public Response<?> createShowTime(@RequestBody EventRequest eventRequest) {
        return ResponseUtil.prepareResponse(showTimeService.createShowTime(eventRequest));
    }
}

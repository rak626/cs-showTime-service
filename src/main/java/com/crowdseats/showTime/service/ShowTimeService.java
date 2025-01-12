package com.crowdseats.showTime.service;

import com.crowdseats.framework.common.schema.event.EventRequest;

public interface ShowTimeService {
    EventRequest createShowTime(EventRequest eventRequest);
//    ShowTimeEntity getShowTime(String showTimeId);
//    ShowTimeEntity updateShowTime(ShowTimeEntity showTime);
//    void deleteShowTime(String showTimeId);
}

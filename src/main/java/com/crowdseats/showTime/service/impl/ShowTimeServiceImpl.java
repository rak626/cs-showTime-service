package com.crowdseats.showTime.service.impl;

import com.crowdseats.framework.common.schema.event.EventRequest;
import com.crowdseats.framework.common.schema.event.ShowTime;
import com.crowdseats.showTime.service.ShowTimeService;
import com.crowdseats.showTime.entity.ShowTimeEntity;
import com.crowdseats.showTime.repository.ShowTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowTimeServiceImpl implements ShowTimeService {
    private final ShowTimeRepository showTimeRepository;

    @Override
    public EventRequest createShowTime(EventRequest eventRequest) {
        List<ShowTime> savedShowTimeList = eventRequest.getShowTimes().stream().map(showTime1 -> {
            ShowTimeEntity showTimeEntity = mapShowTimetoShowTimeEntity(eventRequest, showTime1);
            ShowTimeEntity saved = showTimeRepository.save(showTimeEntity);
            return mapShowTimeEntitytoShowTime(saved);
        }).toList();
        eventRequest.setShowTimes(savedShowTimeList);
        return eventRequest;
    }

    private ShowTime mapShowTimeEntitytoShowTime(ShowTimeEntity saved) {
        ShowTime showTime = new ShowTime();
        showTime.setShowDate(saved.getShowDate());
        showTime.setStartTime(saved.getStartTime());
        showTime.setEndTime(saved.getEndTime());
        showTime.setShowTimeId(saved.getShowTimeId());
        return showTime;
    }

    private ShowTimeEntity mapShowTimetoShowTimeEntity(EventRequest eventRequest, ShowTime showTime1) {
        ShowTimeEntity showTimeEntity = new ShowTimeEntity();
        showTimeEntity.setEventId(eventRequest.getEvent().getEventId());
        showTimeEntity.setShowDate(showTime1.getShowDate());
        showTimeEntity.setStartTime(showTime1.getStartTime());
        showTimeEntity.setEndTime(showTime1.getEndTime());
        return showTimeEntity;
    }


}

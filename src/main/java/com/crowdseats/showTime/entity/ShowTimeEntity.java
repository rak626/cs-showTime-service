package com.crowdseats.showTime.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "show_time", schema = "showtime_schema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String showTimeId;
    private Date showDate;
    private String startTime;
    private String endTime;
    private String eventId;
    @CreationTimestamp
    private Date createdDate;
    @UpdateTimestamp
    private Date updatedDate;
}

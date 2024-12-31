package com.crowdseats.showTime;

import com.crowdseats.showTime.entity.ShowTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimeRepository extends JpaRepository<ShowTimeEntity, String> {
}

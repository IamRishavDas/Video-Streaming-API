package com.stream.api.video_streaming_api.Reporitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stream.api.video_streaming_api.Model.Video;


@Repository
public interface VideoRepo extends JpaRepository<Video, String>{
    
    public Optional<Video> findByTitle(String title);

}

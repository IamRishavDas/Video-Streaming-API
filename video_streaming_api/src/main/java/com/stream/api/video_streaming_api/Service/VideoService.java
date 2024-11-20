package com.stream.api.video_streaming_api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.stream.api.video_streaming_api.Model.Video;
import com.stream.api.video_streaming_api.Reporitory.VideoRepo;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepo videoRepo;

    public List<Video> getAllVideos(){
        return videoRepo.findAll();
    }

    public Video getVideoById(String videoId){
        return videoRepo.findById(videoId).orElse(new Video());
    }

    public Video getVideoByTitle(String title){
        return videoRepo.findByTitle(title).orElse(new Video());
    }

    public void saveVideo(Video video, MultipartFile file){
        
    }


}

package com.stream.api.video_streaming_api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Video")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    
    @Id
    private String videoId;
    private String title;
    private String descritption;
    private String contentType;
    private String filePath;

}

package com.job.joblisting.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Getter
@Setter
@ToString

@Document(collection = "JobPost" )
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];
}

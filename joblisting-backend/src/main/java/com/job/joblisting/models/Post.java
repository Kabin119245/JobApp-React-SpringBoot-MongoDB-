package com.job.joblisting.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];
}

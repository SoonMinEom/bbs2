package com.mustache.bbs2.domain.dto;

import com.mustache.bbs2.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(getId(), getTitle(),getContent());
    }
}

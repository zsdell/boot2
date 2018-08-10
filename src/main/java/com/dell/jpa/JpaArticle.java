package com.dell.jpa;

import com.dell.app.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface JpaArticle extends JpaRepository<ArticleEntity,Long>,JpaSpecificationExecutor<ArticleEntity>,Serializable {

}

package com.dell.controll;

import com.dell.app.ArticleEntity;
import com.dell.jpa.JpaArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class DellControll {

    @Autowired
    private JpaArticle jpaUser;

    @RequestMapping(value = "/user/login")
    public String getLogin(ArticleEntity user, HttpServletRequest request){
        Optional<ArticleEntity> articleEntity = jpaUser.findOne(new Specification<ArticleEntity>() {
            @Override
            public Predicate toPredicate(Root<ArticleEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("userid"), user.getUserid()));
                return null;
            }
        });
        request.getSession().setAttribute("_session_user",articleEntity);
        return "dell";
    }

    @RequestMapping("/user/login_view")
    public String  getDell(){
        return "index";
    }

}

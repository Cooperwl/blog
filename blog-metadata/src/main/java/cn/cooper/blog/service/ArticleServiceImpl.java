package cn.cooper.blog.service;

import com.cooper.blog.ws.dto.ArticleDTO;
import com.cooper.blog.ws.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cooper on 2017/4/2.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public List<ArticleDTO> getAllArticle(String name) {
        return null;
    }
}

package com.github.rends.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.rends.entity.Author;
import com.github.rends.mapper.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 只是一个demo  实际中可能要包装返回类，再加上异常处理器还有拦截器做安全认证
 */
@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    //添加
    @PostMapping("/addAuthor")
    public Boolean addAuthor(@RequestBody Author author){
        return authorService.insert(author)==1?true:false;
    }

    //分页
    @GetMapping("/authorPage")
    public IPage authorPage(@RequestParam Long pageIndex,Long pageSize){
        return authorService.selectPage(new Page().setCurrent(pageIndex).setPages(pageSize), new QueryWrapper<Author>());
    }

    //自定义查找
    @GetMapping("/findByNameDefine")
    public Author findByNameDefine(@RequestParam String name){
        return authorService.findByName(name);
    }

    //QueryWrapper 可封装多种查询
    @GetMapping("/findByName")
    public Author findByName(@RequestParam String name){
        return authorService.selectOne(new QueryWrapper<Author>().eq("name",name));
    }

    //删除 实际是逻辑删除，将标记为@TableLogic的字段设置为配置文件指定的删除值
    @DeleteMapping("/delAuthorById/{authorId}")
    public Boolean delAuthorById(@PathVariable String authorId){
        return authorService.deleteById(authorId)==1? true:false;
    }
}

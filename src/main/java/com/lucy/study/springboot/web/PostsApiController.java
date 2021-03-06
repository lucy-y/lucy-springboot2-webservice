package com.lucy.study.springboot.web;

import com.lucy.study.springboot.web.dto.PostsListResponseDto;
import com.lucy.study.springboot.web.dto.PostsResponseDto;
import com.lucy.study.springboot.web.dto.PostsSaveRequestsDto;
import com.lucy.study.springboot.web.dto.PostsUpdateRequestDto;
import com.lucy.study.springboot.web.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestsDto postsSaveRequestsDto) {
        return postsService.save(postsSaveRequestsDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/posts/list")
    public List<PostsListResponseDto> findAll() {
        return postsService.findAllDesc();
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}

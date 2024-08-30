package com.allitov.controller;

import com.allitov.dto.request.CommentRequest;
import com.allitov.dto.request.PostRequest;
import com.allitov.dto.response.CommentListResponse;
import com.allitov.dto.response.CommentResponse;
import com.allitov.dto.response.PostListResponse;
import com.allitov.dto.response.PostResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

/**
 * Rest controller for post service.
 * @author Alexander Litovkin
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/post")
public final class PostController {

    // post-resource

    /**
     * Endpoint for obtaining all data about posts.
     * @return an HTTP response.
     */
    @GetMapping
    public ResponseEntity<PostListResponse> getAllPosts() {
        log.info("Get all posts request");

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for obtaining post data by ID.
     * @param postId an ID by which to find a post.
     * @return an HTTP response.
     */
    @GetMapping("/{postId}")
    public ResponseEntity<PostResponse> getPostById(@PathVariable("postId") UUID postId) {
        log.info("Get post by id request with id = '{}'", postId);

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for creating post.
     * @param requestBody a request body with post data.
     * @return an HTTP response.
     */
    @PostMapping
    public ResponseEntity<PostResponse> createPost(@RequestBody PostRequest requestBody) {
        log.info("Create post request with body = '{}'", requestBody);

        return ResponseEntity.created(URI.create("/api/v1/post/" + UUID.randomUUID())).build();
    }

    /**
     * Endpoint for updating post data by ID.
     * @param postId an ID by which to find a post.
     * @param requestBody a request body with post data.
     * @return an HTTP response.
     */
    @PutMapping("/{postId}")
    public ResponseEntity<Void> updatePostById(@PathVariable("postId") UUID postId,
                                               @RequestBody PostRequest requestBody) {
        log.info("Update post by id request with id = '{}' and body = '{}'", postId, requestBody);

        return ResponseEntity.noContent().build();
    }

    /**
     * Endpoint for deleting post data by ID.
     * @param postId an ID by which to find a post.
     * @return an HTTP response.
     */
    @DeleteMapping("/{postId}")
    public ResponseEntity<Void> deletePostById(@PathVariable("postId") UUID postId) {
        log.info("Delete post by id request with id = '{}'", postId);

        return ResponseEntity.noContent().build();
    }

    // comment-resource

    /**
     * Endpoint for obtaining all data about post comments.
     * @param postId an ID by which to find a post.
     * @return an HTTP response.
     */
    @GetMapping("/{postId}/comment")
    public ResponseEntity<CommentListResponse> getAllPostComments(@PathVariable("postId") UUID postId) {
        log.info("Get all post comments request with post id = '{}'", postId);

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for obtaining post comment data by ID.
     * @param postId an ID by which to find a post.
     * @param commentId an ID by which to find a comment.
     * @return an HTTP response.
     */
    @GetMapping("/{postId}/comment/{commentId}")
    public ResponseEntity<CommentResponse> getPostCommentById(@PathVariable("postId") UUID postId,
                                                              @PathVariable("commentId") UUID commentId) {
        log.info("Get post comment by id request with post id = '{}' and comment id = '{}'", postId, commentId);

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for creating post comment.
     * @param postId an ID by which to find a post.
     * @param requestBody a request body with comment data.
     * @return an HTTP response.
     */
    @PostMapping("/{postId}/comment")
    public ResponseEntity<Void> createPostComment(@PathVariable("postId") UUID postId,
                                                  @RequestBody CommentRequest requestBody) {
        log.info("Create post comment request with post id = '{}' and body = '{}", postId, requestBody);

        return ResponseEntity.created(URI.create("/api/v1/post/comment/" + UUID.randomUUID())).build();
    }

    /**
     * Endpoint for updating post comment data by ID.
     * @param postId an ID by which to find a post.
     * @param commentId an ID by which to find a comment.
     * @param requestBody a request body with comment data.
     * @return an HTTP response.
     */
    @PutMapping("/{postId}/comment/{commentId}")
    public ResponseEntity<Void> updatePostCommentById(@PathVariable("postId") UUID postId,
                                                      @PathVariable("commentId") UUID commentId,
                                                      @RequestBody CommentRequest requestBody) {
        log.info("Update post comment by id request with post id = '{}', " +
                "comment id = '{}' and body = '{}'", postId, commentId, requestBody);

        return ResponseEntity.noContent().build();
    }

    /**
     * Endpoint for deleting post comment data by ID.
     * @param postId an ID by which to find a post.
     * @param commentId an ID by which to find a comment.
     * @return an HTTP response.
     */
    @DeleteMapping("/{postId}/comment/{commentId}")
    public ResponseEntity<Void> deletePostCommentById(@PathVariable("postId") UUID postId,
                                                      @PathVariable("commentId") UUID commentId) {
        log.info("Delete post comment by id request with post id = '{}' and comment id = '{}'", postId, commentId);

        return ResponseEntity.noContent().build();
    }
}

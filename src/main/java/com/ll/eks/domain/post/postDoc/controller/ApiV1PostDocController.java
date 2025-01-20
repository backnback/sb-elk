package com.ll.eks.domain.post.postDoc.controller;

import com.ll.eks.domain.post.postDoc.document.PostDoc;
import com.ll.eks.domain.post.postDoc.service.PostDocService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/postDocs")
@Validated
public class ApiV1PostDocController {

  private final PostDocService postDocService;

  @PostMapping("write")
  public PostDoc write(
      @RequestParam @NotBlank String title,
      @RequestParam @NotBlank String content) {
    return postDocService.write(title, content);
  }
}

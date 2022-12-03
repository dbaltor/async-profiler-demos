package com.example.firstapplication.examples.context;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/examples/context")
@RequiredArgsConstructor
class ContextController {
    private final ContextService contextService;

    @GetMapping("/")
    String get() {
        contextService.observed();
        return "OK";
    }
}

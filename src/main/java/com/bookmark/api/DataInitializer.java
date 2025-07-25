package com.bookmark.api;

import com.bookmark.api.domain.Bookmark;
import com.bookmark.api.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;
    @Override
    public void run(String... args) throws Exception {
        // This method can be used to initialize data or perform setup tasks
        // when the application starts. For example, you could load initial data
        // into the database or set up configurations.

        // Example: Initialize some bookmarks
        bookmarkRepository.saveAll(
                List.of(
                        new Bookmark(null, "Spring Boot Documentation", "https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/", Instant.now()),
                        new Bookmark(null, "Java Documentation", "https://docs.oracle.com/en/java/javase/17/docs/api/index.html", Instant.now()),
                        new Bookmark(null, "GitHub", "https://github.com", Instant.now()),
                        // Add more bookmarks as needed
                        new Bookmark(null, "Stack Overflow", "https://stackoverflow.com", Instant.now()),
                        new Bookmark(null, "Mozilla Developer Network", "https://developer.mozilla.org/en-US/", Instant.now()),
                        new Bookmark(null, "Google Developers", "https://developers.google.com", Instant.now()),
                        new Bookmark(null, "W3Schools", "https://www.w3schools.com", Instant.now()),
                        new Bookmark(null, "Codecademy", "https://www.codecademy.com", Instant.now()),
                        new Bookmark(null, "Coursera", "https://www.coursera.org", Instant.now()),
                        new Bookmark(null, "edX", "https://www.edx.org", Instant.now()),
                        new Bookmark(null, "Khan Academy", "https://www.khanacademy.org", Instant.now()),
                        new Bookmark(null, "Udemy", "https://www.udemy.com", Instant.now()),
                        new Bookmark(null, "FreeCodeCamp", "https://www.freecodecamp.org", Instant.now()),
                        new Bookmark(null, "LeetCode", "https://leetcode.com", Instant.now()),
                        new Bookmark(null, "HackerRank", "https://www.hackerrank.com", Instant.now()),
                        new Bookmark(null, "GeeksforGeeks", "https://www.geeksforgeeks.org", Instant.now()),
                        new Bookmark(null, "MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web", Instant.now()),
                        new Bookmark(null, "CSS-Tricks", "https://css-tricks.com", Instant.now()),
                        new Bookmark(null, "Dev.to", "https://dev.to", Instant.now()),
                        new Bookmark(null, "Smashing Magazine", "https://www.smashingmagazine.com", Instant.now()),
                        new Bookmark(null, "SitePoint", "https://www.sitepoint.com", Instant.now()),
                        new Bookmark(null, "Tutorialspoint", "https://www.tutorialspoint.com", Instant.now()),
                        new Bookmark(null, "Pluralsight", "https://www.pluralsight.com", Instant.now()),
                        new Bookmark(null, "LinkedIn Learning", "https://www.linkedin.com/learning", Instant.now()),
                        new Bookmark(null, "Microsoft Learn", "https://learn.microsoft.com/en-us/training/", Instant.now()),
                        new Bookmark(null, "Apple Developer Documentation", "https://developer.apple.com/documentation/", Instant.now()),
                        new Bookmark(null, "Android Developers", "https://developer.android.com/docs", Instant.now()),
                        new Bookmark(null, "Python Documentation", "https://docs.python.org/3/", Instant.now()),
                        new Bookmark(null, "Ruby Documentation", "https://www.ruby-lang.org/en/documentation/", Instant.now())
                )
        );

    }
}

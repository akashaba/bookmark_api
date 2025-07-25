package com.bookmark.api.service;

import com.bookmark.api.domain.Bookmark;
import com.bookmark.api.domain.BookmarkDTO;
import com.bookmark.api.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    // Add methods to interact with the BookmarkRepository
    @Transactional(readOnly = true)
    public BookmarkDTO getAllBookmarks(Integer page) {
        int pageNo = page < 1 ? 0 : page - 1; // Convert to zero-based index
        Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");
        return new BookmarkDTO(bookmarkRepository.findAll(pageable));
    }
}

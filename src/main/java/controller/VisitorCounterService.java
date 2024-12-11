package controller;

import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class VisitorCounterService {

    private final AtomicInteger counter = new AtomicInteger(0);

    // Increment visits only once per page load
    public int incrementAndGet() {
        return counter.incrementAndGet();
    }

    // Return the current count without incrementing
    public int getCount() {
        return counter.get();
    }
}
package example.micronaut;

import io.micronaut.core.annotation.Introspected;

import java.time.Month;
import java.util.List;

@Introspected 
public record News(Month month, List<String> headlines) {}
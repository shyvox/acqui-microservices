package cl.acqui.api.event;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Getter
public class Event <K, T> {

    public enum Type {
        CREATE, UPDATE, DELETE
    }
    private final Type eventType;
    private final K key;
    private final T data;
    private final ZonedDateTime eventCreateAt;

    public Event() {
        this.eventType = null;
        this.key = null;
        this.data = null;
        this.eventCreateAt = null;
    }

    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    public ZonedDateTime getEventCreateAt() {
        return eventCreateAt;
    }
}
